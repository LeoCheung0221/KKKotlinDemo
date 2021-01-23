package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ClientDemo {
    public static void main(String[] args) {
        // 创建一个结构对象，并结构对象里创建不同的元素对象
        Computer computer = new Computer();
        // 创建不同的访问者
        ComputerVisitor typeVisitor = new TypeVisitor();
        ComputerVisitor runVisitor = new RunVisitor();

        computer.accept(typeVisitor);
        System.out.println("--------------------------");
        computer.accept(runVisitor);
    }
} 