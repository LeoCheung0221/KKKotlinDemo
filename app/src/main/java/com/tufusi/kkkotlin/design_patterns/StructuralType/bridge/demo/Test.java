package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description 把原本不相关的颜色和形状关联起来，就是桥梁模式的特色
 */
public class Test {

    public static void main(String[] args) {
        Color color = new Green();
        AbstractShape shape = new Square(color);
        shape.draw();
    }
} 