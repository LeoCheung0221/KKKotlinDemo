package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体同事类
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    // 实现具体行动方法
    @Override
    public void action() {
        System.out.println("这是同事1的行为方法！");
    }
}