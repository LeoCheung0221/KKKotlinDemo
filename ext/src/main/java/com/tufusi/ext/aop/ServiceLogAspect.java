package com.tufusi.ext.aop;

import com.tufusi.ext.demo.ServiceA;
import com.tufusi.ext.demo.ServiceB;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by LeoCheung on 2021/1/16.
 *
 * @description 服务日志切面类
 */
@Aspect({ServiceA.class, ServiceB.class})
public class ServiceLogAspect {

    public static void before(Object object, Method method, Object[] args) {
        System.out.println("entering " + method.getDeclaringClass().getSimpleName()
                + "::" + method.getName() + ", args: " + Arrays.toString(args));
    }

    public static void after(Object object, Method method, Object[] args, Object result) {
        System.out.println("leaving " + method.getDeclaringClass().getSimpleName()
                + "::" + method.getName() + ", result: " + result);
    }
}