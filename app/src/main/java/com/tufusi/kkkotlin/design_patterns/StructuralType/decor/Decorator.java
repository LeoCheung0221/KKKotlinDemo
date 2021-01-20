package com.tufusi.kkkotlin.design_patterns.StructuralType.decor;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
abstract public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}