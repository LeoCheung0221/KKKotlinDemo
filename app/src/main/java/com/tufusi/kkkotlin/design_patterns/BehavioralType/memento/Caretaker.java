package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 负责人角色
 */
public class Caretaker {

    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}