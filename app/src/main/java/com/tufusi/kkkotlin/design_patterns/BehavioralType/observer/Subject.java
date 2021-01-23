package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public interface Subject {

    // 登记一个新的观察者
    void attach(Observer observer);

    // 删除一个登记过的观察者
    void detach(Observer observer);

    // 通知所有登记过的观察者对象
    void notifyObserver();
}

