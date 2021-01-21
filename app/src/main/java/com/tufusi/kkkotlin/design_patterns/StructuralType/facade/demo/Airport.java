package com.tufusi.kkkotlin.design_patterns.StructuralType.facade.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class Airport {

    public void bookTicket(String from, String to) {
        System.out.println("订购了从" + from + "到" + to + "的机票");
    }
} 