package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象访问者对象
 */
public interface Visitor {
    //可以访问哪些对象
    void visit(ConcreteElement1 el1);
    void visit(ConcreteElement2 el2);
}

