package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ConcreteSubject implements Subject {

    private Vector<Observer> obsVector = new Vector<>();

    @Override
    public void attach(Observer observer) {
        obsVector.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        obsVector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : obsVector) {
            observer.update();
        }
    }

    // 业务方法，改变主题状态
    public void change() {
        this.notifyObserver();
    }

    //返回观察者集合的Enumeration对象
    public Enumeration<Observer> observers() {
        return obsVector.elements();
    }
}