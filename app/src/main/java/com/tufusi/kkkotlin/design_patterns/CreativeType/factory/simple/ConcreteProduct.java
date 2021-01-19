package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 具体产品角色
 * 该角色实现抽象产品角色所声明的接口，工厂方法模式所创建的每一个对象都是某个具体产品角色的实例
 */
public class ConcreteProduct implements Product {
    @Override
    public void method1() {
        // 业务逻辑处理代码
    }

    @Override
    public void method2() {
        // 业务逻辑处理代码
    }
}