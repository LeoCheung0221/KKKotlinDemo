package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Man extends Person {

    public Man(String name, int age, int requestAge, MarriageAgency agency) {
        super(name, age, Sex.MALE, requestAge, agency);
    }
}