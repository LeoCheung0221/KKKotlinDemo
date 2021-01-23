package com.tufusi.kkkotlin.design_patterns.BehavioralType.strategy.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class ContextClient {

    private DiscountStrategy ds;

    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double contextCalDisc() {
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println("无折扣：" + context0.contextCalDisc());
        ContextClient context1 = new ContextClient(new FixDiscountStrategy(46, 60));
        System.out.println("固定折扣：" + context1.contextCalDisc());
        ContextClient context2 = new ContextClient(new PercentageDiscountStrategy(38, 40));
        System.out.println("15%折扣：" + context2.contextCalDisc());
    }
}