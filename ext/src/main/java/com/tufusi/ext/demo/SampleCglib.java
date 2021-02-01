package com.tufusi.ext.demo;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by LeoCheung on 2021/1/16.
 *
 * @description
 */
public class SampleCglib {

    static class ConcreteService {
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SampleInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects,
                                MethodProxy methodProxy) throws Throwable {
            System.out.println("entering method: " + method.getName());
            Object result = methodProxy.invokeSuper(o, objects);
            System.out.println("leaving method: " + method.getName());
            return result;
        }
    }

    private static <T> T getProxy(Class<T> cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new SampleInterceptor());
        return (T) enhancer.create();
    }

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/SZSS/Desktop/cglib/JavaHelper");
        ConcreteService proxyService = getProxy(ConcreteService.class);
        proxyService.sayHello();
    }
} 