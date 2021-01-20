package com.tufusi.kkkotlin.design_patterns.StructuralType.decor.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 汽车装饰（抽象装饰）
 */
abstract public class CarDecorator implements Car {

    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        car.show();
    }
}