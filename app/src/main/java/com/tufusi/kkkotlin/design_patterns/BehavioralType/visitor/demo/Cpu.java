package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Cpu extends HardWare {

    public Cpu(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + "的CPU正在运行");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visitCpu(this);
    }
}