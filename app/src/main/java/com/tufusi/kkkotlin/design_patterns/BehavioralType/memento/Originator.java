package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 发起人角色
 */
public class Originator {

    //内部状态
    private String  state ="";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }

    // 恢复备忘录
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}