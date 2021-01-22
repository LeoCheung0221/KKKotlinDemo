package com.tufusi.kkkotlin.design_patterns.BehavioralType.template.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 抽象模板  抽象账户类
 */
abstract public class Account {
    //账号
    private String accountNumber = null;

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 基本方法，确定账户类型，留给子类实现
    protected abstract String getAccountType();

    // 基本方法，确定利息，留给子类实现
    protected abstract double getInterestRate();

    // 基本方法，根据账户类型和账号确定账户金额
    public double calculateAmount(String accountType, String accountNumber) {
        // 范根数据库
        return 4567.89d;
    }

    // 模板方法，计算账户利息
    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }

}