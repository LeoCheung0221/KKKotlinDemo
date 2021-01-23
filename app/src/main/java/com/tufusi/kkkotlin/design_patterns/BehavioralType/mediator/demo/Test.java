package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Test {
    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyImpl();

        Person m1 = new Man("John", 20, 18, agency);
        Person m2 = new Man("Mike", 27, 25, agency);
        Person w1 = new Woman("Mary", 25, 27, agency);
        Person w2 = new Woman("Lucy", 20, 22, agency);

        m1.findPartner();
        m2.findPartner();
    }
} 