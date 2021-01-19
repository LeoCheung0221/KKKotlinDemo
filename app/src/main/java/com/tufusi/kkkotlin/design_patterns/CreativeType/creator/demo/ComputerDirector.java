package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 构建计算机的导演者角色
 */
public class ComputerDirector {

    ComputerBuilder builder;

    // 构建T410型计算机
    public T410 constructT410(){
        builder = new T410Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildGraphicCard();
        builder.buildMonitor();
        builder.buildOs();

        return (T410) builder.getResult();
    }

    // 构建X201型计算机
    public X201 constructX201(){
        builder = new X201Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildMonitor();
        builder.buildOs();

        return (X201) builder.getResult();
    }
} 