package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.abs;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ProductB1 implements ProductB {
    @Override
    public void method1() {
        System.out.println("等级为1的产品B的实现方法");
    }

    @Override
    public void method2() {
        // 业务逻辑处理代码
    }
}