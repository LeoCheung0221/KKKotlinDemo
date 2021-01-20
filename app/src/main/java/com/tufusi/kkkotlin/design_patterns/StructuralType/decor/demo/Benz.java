package com.tufusi.kkkotlin.design_patterns.StructuralType.decor.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 奔驰车（裸车，需要装饰）
 */
public class Benz implements Car {
    @Override
    public void show() {
        System.out.println("奔驰车的默认颜色是黑色");
    }
}