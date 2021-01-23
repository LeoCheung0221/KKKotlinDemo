package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Variable implements ArithmeticExpression {

    @Override
    public int interpret(Variables variables) {
        return variables.get(this);
    }
}