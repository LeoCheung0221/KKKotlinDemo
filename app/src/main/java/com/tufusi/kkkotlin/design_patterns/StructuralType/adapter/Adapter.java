package com.tufusi.kkkotlin.design_patterns.StructuralType.adapter;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}