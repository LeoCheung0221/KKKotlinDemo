package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
abstract public class Computer {

    private String type; // 型号
    private String cpu; // CPU
    private String ram; // 内存
    private String hardDisk; //硬盘
    private String monitor; //显示器
    private String os; // 操作系统

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}