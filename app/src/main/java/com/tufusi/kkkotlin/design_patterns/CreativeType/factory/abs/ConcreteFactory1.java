package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.abs;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ConcreteFactory1 implements AbstractFactory {

    // 创建等级为1的产品A
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    // 创建等级为1的产品B
    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}