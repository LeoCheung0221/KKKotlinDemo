package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 结构对象角色
 */
public class Computer {

    private Cpu cpu;
    private HardWare hardWare;

    public Computer() {
        cpu = new Cpu("Intel Core i7-620");
        hardWare = new HardDisk("Seagate 500G 7200转");
    }

    // 接受不同访问器访问
    public void accept(ComputerVisitor computerVisitor){
        cpu.accept(computerVisitor);
        hardWare.accept(computerVisitor);
    }
}