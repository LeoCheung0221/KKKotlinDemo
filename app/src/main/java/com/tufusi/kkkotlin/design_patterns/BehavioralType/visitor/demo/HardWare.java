package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
abstract public class HardWare {
    String type; // 型号

    public HardWare(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //运转
    public abstract void run();

    // 接受计算机访问者
    public abstract void accept(ComputerVisitor computerVisitor);
}