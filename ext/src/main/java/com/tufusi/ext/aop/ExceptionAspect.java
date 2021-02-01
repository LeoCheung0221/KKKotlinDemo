package com.tufusi.ext.aop;

import com.tufusi.lib.ServiceB;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by LeoCheung on 2021/1/16.
 *
 * @description 异常切面类
 */
@Aspect(ServiceB.class)
public class ExceptionAspect {

    public static void exception(Object object, Method method, Object[] args, Throwable throwable) {
        System.out.println("exception when calling: " + method.getName() + ", " + Arrays.toString(args));
    }
}