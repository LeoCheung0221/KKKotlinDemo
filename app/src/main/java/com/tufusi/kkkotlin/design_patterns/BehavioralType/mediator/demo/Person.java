package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
abstract public class Person {
    String name; //姓名
    int age; // 年龄
    Sex sex; //性别
    int requestAge; //要求对象的年龄，对象只有这一个要求
    MarriageAgency agency; // 婚姻中介

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        agency.register(this); // 注册会员
    }

    public void findPartner(){
        agency.pair(this);
    }

    enum Sex {
        MALE, FEMALE;
    }
} 