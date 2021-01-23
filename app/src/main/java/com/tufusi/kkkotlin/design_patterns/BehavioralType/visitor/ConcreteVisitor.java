package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体访问者元素
 */
public class ConcreteVisitor implements Visitor {

    // 访问元素1
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.operation();
    }

    // 访问元素2
    @Override
    public void visit(ConcreteElement2 el2) {
        el2.operation();
    }
}