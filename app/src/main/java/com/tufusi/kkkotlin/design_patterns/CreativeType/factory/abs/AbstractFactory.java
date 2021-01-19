package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.abs;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 抽象工厂角色
 * 该角色是抽象工厂模式的核心。与应用系统无关，任何创建对象的工厂类必须实现这个接口
 */
interface AbstractFactory {

    // 创建产品A
    ProductA factoryA();

    // 创建产品B
    ProductB factoryB();
}

