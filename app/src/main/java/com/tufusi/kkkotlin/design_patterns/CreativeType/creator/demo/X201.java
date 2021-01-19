package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

import androidx.annotation.NonNull;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class X201 extends Computer {

    public X201() {
        this.setType("ThinkPad X201i");
    }

    @NonNull
    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu() +
                "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk() +
                "\n显示器：\t" + this.getMonitor() + "\n操作系统：" + this.getOs();
    }
}