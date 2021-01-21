package com.tufusi.kkkotlin.design_patterns.StructuralType.facade.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class Boss {

    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        System.out.println("老板告诉秘书要到上海出差10天");

        secretary.trip("上海", 10);
        System.out.println("----------------------------------------");
        System.out.println("老板告诉秘书要请8个人吃饭");
        secretary.repast(8);
    }
} 