package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.abs;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ConcreteFactory2 implements AbstractFactory {

    // 创建等级为2的产品A
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    // 创建等级为2的产品B
    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}