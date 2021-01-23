package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public interface ClickableObserver {
    // 发生点击事件的操作
    void clicked(Clickable clickable);
} 