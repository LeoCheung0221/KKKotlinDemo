package com.tufusi.kkkotlin.design_patterns.StructuralType.combine.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ConcreteCompany implements Company {

    private List<Company> companyList = new ArrayList<>();
    private String name;
    private String position;
    private double salary;

    public ConcreteCompany(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        companyList.add(company);
    }

    public void remove(Company company) {
        companyList.remove(company);
    }

    public List<Company> getCompanyList() {
        return companyList;
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