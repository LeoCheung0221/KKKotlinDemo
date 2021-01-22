package com.tufusi.kkkotlin.design_patterns.BehavioralType.template;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass aClass = new ConcreteClass();
        // 调用模板方法
        aClass.templateMethod();
    }
} 