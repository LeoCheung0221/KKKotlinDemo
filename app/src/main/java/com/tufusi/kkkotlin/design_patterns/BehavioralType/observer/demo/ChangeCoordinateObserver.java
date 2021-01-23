package com.tufusi.kkkotlin.design_patterns.BehavioralType.observer.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ChangeCoordinateObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.x = 200;
        button.y = 150;
    }
}