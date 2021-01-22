package com.tufusi.kkkotlin.design_patterns.BehavioralType.template.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class FixedAccount extends Account {
    @Override
    protected String getAccountType() {
        return "一年定期";
    }

    @Override
    protected double getInterestRate() {
        return 0.0325d;
    }
}