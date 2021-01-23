package com.tufusi.kkkotlin.design_patterns.BehavioralType.state;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体状态2
 */
public class ConcreteState2 extends State {

    // 状态2的行为逻辑处理
    @Override
    public void handle() {
        System.out.println("行为2的逻辑处理");
    }
}