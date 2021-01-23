package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class OtherObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作......");
    }
}