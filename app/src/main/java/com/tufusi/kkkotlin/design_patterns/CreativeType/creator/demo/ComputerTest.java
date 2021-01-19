package com.tufusi.kkkotlin.design_patterns.CreativeType.creator.demo;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ComputerTest {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer t410 = director.constructT410();
        System.out.println(t410);
        System.out.println("----------------------------");
        Computer x201 = director.constructX201();
        System.out.println(x201);
    }
} 