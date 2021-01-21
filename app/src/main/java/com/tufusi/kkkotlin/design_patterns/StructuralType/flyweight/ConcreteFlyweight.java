package com.tufusi.kkkotlin.design_patterns.StructuralType.flyweight;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState; // 内部状态

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态：" + intrinsicState + "，外部状态：" + extrinsicState);
    }
}