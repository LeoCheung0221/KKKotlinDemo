package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class X201Builder implements ComputerBuilder {

    private X201 computer = new X201();

    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("250GB 5400转");
    }

    @Override
    public void buildGraphicCard() {
        // 无显卡
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 7 家庭版");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}