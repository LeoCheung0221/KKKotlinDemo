package com.tufusi.ext.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LeoCheung on 2021/1/16.
 *
 * @description
 */
public class CglibContainer {

    static Map<Class<?>, Map<InterceptPoint, List<Method>>> interceptMethodsMap = new HashMap<>();
    static Class<?>[] aspects = new Class[]{
            ServiceLogAspect.class,
            ExceptionAspect.class
    };

    static {
        init();
    }

    private static void init() {
        for (Class<?> cls : aspects) {
            Aspect aspect = cls.getAnnotation(Aspect.class);
            if (aspect != null) {
                Method before = getMethod(cls, "before", new Class<?>[]{Object.class, Method.class, Object[].class});
                Method after = getMethod(cls, "after", new Class<?>[]{Object.class, Method.class, Object[].class, Object.class});
                Method exception = getMethod(cls, "exception", new Class<?>[]{Object.class, Method.class, Object[].class, Throwable.class});

                Class<?>[] interceptedArr = aspect.value();
                for (Class<?> intercepted : interceptedArr) {
                    addInterceptMethod(intercepted, InterceptPoint.BEFORE, before);
                    addInterceptMethod(intercepted, InterceptPoint.AFTER, after);
                    addInterceptMethod(intercepted, InterceptPoint.EXCEPTION, exception);
                }
            }
        }
    }

    private static Method getMethod(Class<?> cls, String value, Class<?>[] classes) {
        return null;
    }

    private static void addInterceptMethod(Class<?> cls, InterceptPoint point, Method method) {
        if (method == null) {
            return;
        }

        Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
        if (map == null) {
            map = new HashMap<>();
            interceptMethodsMap.put(cls, map);
        }
        List<Method> methods = map.get(point);
        if (methods == null || methods.size() == 0) {
            methods = new ArrayList<>();
            map.put(point, methods);
        }
        methods.add(method);
    }

    public static <T> T getInstance(Class<T> cls) {
        try {
            T obj = createInstance(cls);
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(Inject.class)) {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    Class<?> fieldCls = f.getType();
                    f.set(obj, getInstance(fieldCls));
                }
            }
            return obj;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    private static <T> T createInstance(Class<T> cls)
            throws InstantiationException, IllegalAccessException {

        if (!interceptMethodsMap.containsKey(cls)) {
            return (T) cls.newInstance();
        }
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new AspectInterceptor());
        return (T) enhancer.create();
    }

    static class AspectInterceptor implements MethodInterceptor {
        @Override
        public Object intercept(Object o, Method method, Object[] objects,
                                MethodProxy methodProxy) throws Throwable {
            // 执行before方法
            List<Method> beforeMethods = getInterceptMethods(o.getClass().getSuperclass(), InterceptPoint.BEFORE);
            for (Method m : beforeMethods) {
                m.invoke(null, new Object[]{o, method, objects});
            }
            try {
                // 调用原始方法
                Object result = methodProxy.invokeSuper(o, objects);
                // 执行after方法
                List<Method> afterMethods = getInterceptMethods(o.getClass().getSuperclass(), InterceptPoint.AFTER);
                for (Method m : afterMethods) {
                    m.invoke(null, new Object[]{o, method, objects, result});
                }

                return result;
            } catch (Throwable e) {
                // 执行exception方法
                List<Method> exceptionMethods = getInterceptMethods(o.getClass().getSuperclass(), InterceptPoint.EXCEPTION);
                for (Method m : exceptionMethods) {
                    m.invoke(null, new Object[]{o, method, objects, e});
                }
                throw e;
            }
        }
    }

    static List<Method> getInterceptMethods(Class<?> cls, InterceptPoint point) {
        Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
        if (map == null) {
            return Collections.emptyList();
        }
        List<Method> methods = map.get(point);
        if (methods == null) {
            return Collections.emptyList();
        }
        return methods;
    }
}