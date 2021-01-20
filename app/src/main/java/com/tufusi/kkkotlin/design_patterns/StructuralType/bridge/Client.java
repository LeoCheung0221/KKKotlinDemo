package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor implementor = new ConcreteImplementor();
        // 定义一个抽象化角色
        Abstraction abstraction = new RefinedAbstraction(implementor);

        abstraction.operation();
    }
} 