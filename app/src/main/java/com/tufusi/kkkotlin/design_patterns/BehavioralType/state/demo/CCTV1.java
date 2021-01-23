package com.tufusi.kkkotlin.design_patterns.BehavioralType.state.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class CCTV1 implements Channel {
    @Override
    public void display() {
        System.out.println("CCTV1 新闻联播");
    }
}