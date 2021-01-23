package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class TypeVisitor implements ComputerVisitor {
    @Override
    public void visitCpu(Cpu cpu) {
        System.out.println("CPU型号：" + cpu.getType());
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        System.out.println("硬盘型号：" + hardDisk.getType());
    }
}