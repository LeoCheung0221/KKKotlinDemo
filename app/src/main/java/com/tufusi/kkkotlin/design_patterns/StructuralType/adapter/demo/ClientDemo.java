package com.tufusi.kkkotlin.design_patterns.StructuralType.adapter.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ClientDemo {

    public static void main(String[] args) {
        Wonton adapter = new FoodAdapter();
        adapter.makeWonton();
    }
} 