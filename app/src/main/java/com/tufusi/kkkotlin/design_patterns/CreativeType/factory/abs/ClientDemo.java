package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.abs;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ClientDemo {
    public static void main(String[] args) {
        // 定义两个工厂方法
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        // 生产等级为1的产品A
        ProductA a1 = factory1.factoryA();
        // 生产等级为2的产品A
        ProductA a2 = factory2.factoryA();
        // 生产等级为1的产品B
        ProductB b1 = factory1.factoryB();
        // 生产等级为2的产品B
        ProductB b2 = factory2.factoryB();

        // 业务处理
        a1.method1();
        a2.method1();
        b1.method1();
        b2.method1();
    }
} 