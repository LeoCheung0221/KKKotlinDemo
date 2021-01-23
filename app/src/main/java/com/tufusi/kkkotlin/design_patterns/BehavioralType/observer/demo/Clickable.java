package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public interface Clickable {
    // 单击
    void click();
    // 添加点击事件的观察者
    void addClickableObserver(ClickableObserver observer);
    //移除单击事件的观察者
    void removeClickableObserver(ClickableObserver observer);
}

