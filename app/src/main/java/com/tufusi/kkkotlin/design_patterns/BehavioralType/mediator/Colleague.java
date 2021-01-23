package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象同事类
 */
abstract public class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 抽象行为方法，由子类实现
    public abstract void action();

    // 业务方法，调用此方法改变对象的内部状态
    public void change(){
        mediator.colleagueChanged(this);
    }
}