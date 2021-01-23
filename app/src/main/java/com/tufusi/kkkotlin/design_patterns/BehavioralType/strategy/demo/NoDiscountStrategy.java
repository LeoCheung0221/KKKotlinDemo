package com.tufusi.kkkotlin.design_patterns.BehavioralType.strategy.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class NoDiscountStrategy  extends DiscountStrategy{
    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}