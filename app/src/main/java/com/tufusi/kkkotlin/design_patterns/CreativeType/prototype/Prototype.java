package com.tufusi.kkkotlin.design_patterns.CreativeType.prototype;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 抽象原型角色
 * 该角色是一个抽象角色，通常由一个Java接口或者抽象类实现，给出所有的具体原型类所需的接口
 */
public interface Prototype extends Cloneable {
    // 克隆方法
    Prototype clone();
}

