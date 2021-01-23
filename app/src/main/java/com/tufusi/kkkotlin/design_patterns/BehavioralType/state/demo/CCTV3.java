package com.tufusi.kkkotlin.design_patterns.BehavioralType.state.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class CCTV3 implements Channel {
    @Override
    public void display() {
        System.out.println("CCTV3 芝麻开门");
    }
}