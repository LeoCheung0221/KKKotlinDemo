package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("收到通知，并进行处理！");
    }
}