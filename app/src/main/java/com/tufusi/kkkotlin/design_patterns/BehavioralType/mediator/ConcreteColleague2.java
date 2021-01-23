package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体同事类
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    // 实现具体行动方法
    @Override
    public void action() {
        System.out.println("这是同事2的行为方法！");
    }
}