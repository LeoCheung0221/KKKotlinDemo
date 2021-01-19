package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public interface ComputerBuilder {
    void buildCpu(); // 构建CPU
    void buildRam(); // 构建内存
    void buildHardDisk(); //构建硬盘
    void buildGraphicCard(); //构建显卡
    void buildMonitor(); // 构建显示器
    void buildOs(); // 构建操作系统

    Computer getResult(); // 获取构建完成的计算机
}

