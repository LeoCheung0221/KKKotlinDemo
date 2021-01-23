package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个主题对象（被观察者）
        ConcreteSubject subject = new ConcreteSubject();
        // 创建一个观察者
        ConcreteObserver observer = new ConcreteObserver();
        //登记观察者
        subject.attach(observer);
        // 改变状态
        subject.change();
    }
} 