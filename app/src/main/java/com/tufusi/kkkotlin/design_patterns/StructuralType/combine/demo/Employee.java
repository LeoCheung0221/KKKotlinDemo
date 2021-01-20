package com.tufusi.kkkotlin.design_patterns.StructuralType.combine.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Employee implements Company {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + name;
        info = info + "\t职位：" + position;
        info = info + "\t薪水：" + salary;
        return info;
    }
}