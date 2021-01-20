package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 修正抽象化角色
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    // 修正父类的方法
    @Override
    public void operation() {
//        super.operation();
        System.out.println("修正正确方法");
    }
}