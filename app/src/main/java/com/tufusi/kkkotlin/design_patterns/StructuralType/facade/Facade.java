package com.tufusi.kkkotlin.design_patterns.StructuralType.facade;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class Facade {
    // 被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    // 提供外界的方法
    public void methodA() {
        a.methodA();
    }

    public void methodB() {
        b.methodB();
    }

    public void methodC() {
        c.methodC();
    }
}