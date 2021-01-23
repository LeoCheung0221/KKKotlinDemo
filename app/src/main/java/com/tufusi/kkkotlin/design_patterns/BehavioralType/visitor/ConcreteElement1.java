package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体元素1
 */
public class ConcreteElement1 extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 业务逻辑方法
    public void operation(){
        System.out.println("访问元素1");
    }
}