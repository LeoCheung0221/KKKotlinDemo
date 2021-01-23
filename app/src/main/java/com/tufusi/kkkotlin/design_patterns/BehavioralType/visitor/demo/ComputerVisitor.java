package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 代表计算机硬件的访问者
 */
public interface ComputerVisitor {
    void visitCpu(Cpu cpu); // 访问CPU

    void visitHardDisk(HardDisk hardDisk); // 访问硬盘
}