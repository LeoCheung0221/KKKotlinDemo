package com.tufusi.kkkotlin.design_patterns.StructuralType.decor;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }

    // 定义自己的方法
    private void method() {
        System.out.println("修饰方法");
    }
}