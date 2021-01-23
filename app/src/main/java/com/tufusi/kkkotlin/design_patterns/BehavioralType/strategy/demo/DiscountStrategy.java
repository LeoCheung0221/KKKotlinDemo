package com.tufusi.kkkotlin.design_patterns.BehavioralType.strategy.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 抽象折扣算法类
 */
abstract public class DiscountStrategy {

    // 书的价格
    private double price = 0;
    // 书的数量
    private int number = 0;

    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    // 策略方法
    public abstract double calculateDiscount();
}