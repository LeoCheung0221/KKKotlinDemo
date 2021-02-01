package com.tufusi.ext.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;


/**
 * Created by LeoCheung on 2021/1/14.
 *
 * @description
 */
public class SampleDynamicProxy {

    interface IService {
        void sayHello();
    }

    static class ConcreteService implements IService {

        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class SampleInvocationHandler implements InvocationHandler {

        private Object mRealObj;

        public SampleInvocationHandler(Object obj) {
            mRealObj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering method: " + method.getName());
            Object result = method.invoke(mRealObj, args);
            System.out.println("leaving method: " + method.getName());
            return result;
        }
    }

    public static void main(String[] args) {
        IService concreteService = new ConcreteService();
//        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
//                new Class<?>[]{IService.class}, new SampleInvocationHandler(concreteService));

        Class<?> proxyClass = Proxy.getProxyClass(IService.class.getClassLoader(), new Class<?>[]{IService.class});
        try {
            Constructor<?> constructor = proxyClass.getConstructor(new Class<?>[]{InvocationHandler.class});
            SampleInvocationHandler handler = new SampleInvocationHandler(concreteService);
            IService proxyService = (IService) constructor.newInstance(handler);

            saveProxy0();

            proxyService.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> T getProxy(Class<T> interfaces, T realObj) {
        return (T) Proxy.newProxyInstance(interfaces.getClassLoader(),
                new Class[]{interfaces},
                new SampleInvocationHandler(realObj));
    }

    private static void saveProxy0() throws IOException {
        byte[] bytes = ProxyGenerator
                .generateProxyClass("$Proxy0", new Class<?>[]{IService.class});

        String pathDir = "C:\\Users\\SZSS\\Desktop\\out";
        String path = "\\$Proxy0.class";
        File f = new File(pathDir);
        if (!f.exists()) {
            f.mkdir();
        }
        path = f.getAbsolutePath() + path;
        f = new File(path);
        if (f.exists()) {
            f.delete();
        }
        f.createNewFile();

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}