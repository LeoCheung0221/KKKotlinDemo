package com.tufusi.kkkotlin.design_patterns.BehavioralType.template.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class ClientAccount {
    public static void main(String[] args) {
        Account account = new DemandAccount();
        System.out.println("活期利息：" + account.calculateInterest());
        account = new FixedAccount();
        System.out.println("定期利息：" + account.calculateInterest());
    }
} 