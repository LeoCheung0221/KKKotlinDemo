package com.tufusi.kkkotlin.design_patterns.BehavioralType.state;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体状态1
 */
public class ConcreteState1 extends State {

    // 状态1的行为逻辑处理
    @Override
    public void handle() {
        System.out.println("行为1的逻辑处理");
    }
}