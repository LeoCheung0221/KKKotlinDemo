package com.tufusi.kkkotlin.design_patterns.BehavioralType.strategy.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }
}