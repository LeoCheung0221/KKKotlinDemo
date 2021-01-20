package com.tufusi.kkkotlin.design_patterns.StructuralType.decor;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        // 进行装饰
        component = new ConcreteDecorator(component);
        component.operate();
    }
} 