package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Subtract implements ArithmeticExpression {

    ArithmeticExpression left;
    ArithmeticExpression right;

    public Subtract(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Variables variables) {
        return left.interpret(variables) - right.interpret(variables);
    }
}