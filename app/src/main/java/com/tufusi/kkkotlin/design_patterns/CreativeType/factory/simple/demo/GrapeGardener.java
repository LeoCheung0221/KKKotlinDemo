package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class GrapeGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Grape();
    }
}