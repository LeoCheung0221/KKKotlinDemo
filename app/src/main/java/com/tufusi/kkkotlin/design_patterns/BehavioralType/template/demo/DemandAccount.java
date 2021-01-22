package com.tufusi.kkkotlin.design_patterns.BehavioralType.template.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 活期账户类
 */
public class DemandAccount extends Account {
    @Override
    protected String getAccountType() {
        return "活期账户";
    }

    @Override
    protected double getInterestRate() {
        return 0.005d;
    }
}