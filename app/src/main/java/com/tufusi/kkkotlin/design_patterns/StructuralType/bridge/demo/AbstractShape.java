package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
abstract public class AbstractShape {

    Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}