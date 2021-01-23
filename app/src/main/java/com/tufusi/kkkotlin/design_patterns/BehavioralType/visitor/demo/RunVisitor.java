package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class RunVisitor implements ComputerVisitor {
    @Override
    public void visitCpu(Cpu cpu) {
        cpu.run();
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        hardDisk.run();
    }
}