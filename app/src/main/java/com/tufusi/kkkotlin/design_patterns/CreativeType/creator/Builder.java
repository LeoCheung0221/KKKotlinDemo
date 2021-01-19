package com.tufusi.kkkotlin.design_patterns.CreativeType.creator;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 抽象建造者角色
 * 该角色用于规范产品的各个组成部分，并进行抽象，一般独立于应用程序的逻辑
 */
abstract public class Builder {
    // 设置产品的不同部分，以获得不同的产品
    public abstract void setPart1();

    public abstract void setPart2();

    public abstract void setPart3();

    // ......其他部件

    // 建造产品
    public abstract Product builderProduct();
}