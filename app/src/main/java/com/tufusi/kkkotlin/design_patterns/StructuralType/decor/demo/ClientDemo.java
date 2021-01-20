package com.tufusi.kkkotlin.design_patterns.StructuralType.decor.demo;


/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ClientDemo {

    public static void main(String[] args) {
        Car car = new Benz();
        CarDecorator decorator = new ConcreteCarDecorator(car);

        decorator.show();
    }
} 