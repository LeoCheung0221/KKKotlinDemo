package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();
        // 定义负责人
        Caretaker caretaker = new Caretaker();
        // 创建备忘录
        caretaker.setMemento(originator.createMemento());
        // 恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
} 