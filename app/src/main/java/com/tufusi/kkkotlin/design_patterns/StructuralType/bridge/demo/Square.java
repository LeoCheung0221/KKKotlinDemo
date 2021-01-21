package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class Square extends AbstractShape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("使用" + color.getColor() + "画正方形");
    }
}