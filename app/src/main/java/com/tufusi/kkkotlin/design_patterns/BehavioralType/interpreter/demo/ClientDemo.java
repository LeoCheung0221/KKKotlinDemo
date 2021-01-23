package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter.demo;

import com.tufusi.kkkotlin.design_patterns.CreativeType.prototype.demo.Mail;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ClientDemo {
    public static void main(String[] args) {
        Variables v = new Variables();
        Variable x = new Variable();
        Variable y = new Variable();
        Variable z = new Variable();

        v.put(x, 10);
        v.put(y, 20);
        v.put(z, 30);

        // 计算 x * (y + z/x) -x
        ArithmeticExpression e = new Subtract(new Multiply(x, new Plus(y, new Divison(z, x))), x);
        System.out.println(e.interpret(v));
    }
} 