package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象中介者
 */
abstract public class Mediator {
    // 中介者模式的业务逻辑方法
    public abstract void colleagueChanged(Colleague colleague);
} 