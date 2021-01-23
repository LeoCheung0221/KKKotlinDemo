package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 具体主题
 */
public class Button implements Clickable {

    //存储注册过的单击事件观察者
    private List<ClickableObserver> observers = new ArrayList<>();
    // 按钮信息 颜色、坐标
    String color;
    int x, y;

    @Override
    public void click() {
        System.out.println("按钮被点击");
        for (int i = observers.size() - 1; i >= 0; i--) {
            observers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeClickableObserver(ClickableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "按钮颜色：" + color + ", 坐标：x=" + x + ", y=" + y;
    }
}