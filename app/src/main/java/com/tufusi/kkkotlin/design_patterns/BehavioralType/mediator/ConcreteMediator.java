package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体中介者
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 c1;
    private ConcreteColleague2 c2;

    @Override
    public void colleagueChanged(Colleague colleague) {
        c1.action();
        c2.action();
    }

    // 工厂方法，创建同事对象
    public void createConcreteMediator(){
        c1 = new ConcreteColleague1(this);
        c2 = new ConcreteColleague2(this);
    }

    // 获取同事对象

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }
}