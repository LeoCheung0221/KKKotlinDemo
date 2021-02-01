package com.tufusi.ext.demo;

import com.tufusi.lib.aop.Inject;

/**
 * Created by LeoCheung on 2021/1/16.
 *
 * @description
 */
public class ServiceA {

    @Inject
    ServiceB b;

    public void callB() {
        b.action();
    }

    public static void main(String[] args) {
//        ClassLoader classLoader = ServiceA.class.getClassLoader();
//        while (classLoader != null) {
//            System.out.println(classLoader.getClass().getName());
//            classLoader = classLoader.getParent();
//        }
//        System.out.println(String.class.getClassLoader());

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        try {
            Class<?> cls = systemClassLoader.loadClass("java.util.ArrayList");
            ClassLoader classLoader = cls.getClassLoader();
            System.out.println(classLoader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
} 