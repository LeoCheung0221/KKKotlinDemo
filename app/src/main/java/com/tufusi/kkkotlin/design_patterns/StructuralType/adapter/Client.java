package com.tufusi.kkkotlin.design_patterns.StructuralType.adapter;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
} 