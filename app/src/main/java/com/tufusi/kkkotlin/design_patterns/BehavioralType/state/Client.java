package com.tufusi.kkkotlin.design_patterns.BehavioralType.state;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //执行行为
        context.handle1();
        context.handle2();
    }
} 