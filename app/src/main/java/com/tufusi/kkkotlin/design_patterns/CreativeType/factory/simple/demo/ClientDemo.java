package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ClientDemo {

    public static void main(String[] args) {
        // 苹果园丁工厂
        FruitGardener fruitGardener = new AppleGardener();
        // 通过工厂生产苹果
        Fruit apple = fruitGardener.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

        // 葡萄园丁工厂
        fruitGardener = new GrapeGardener();
        // 通过工厂生产葡萄
        Fruit grape = fruitGardener.factory();
        grape.plant();
        grape.grow();
        grape.harvest();
    }
} 