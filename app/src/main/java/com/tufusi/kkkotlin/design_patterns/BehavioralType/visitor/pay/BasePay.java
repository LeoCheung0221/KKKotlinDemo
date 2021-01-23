package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
abstract public class BasePay {
    int payType;
    boolean enable;

    public BasePay(int payType) {
        this.payType = payType;
    }

    public BasePay(int payType, boolean enable) {
        this.payType = payType;
        this.enable = enable;
    }

    public int getPayType() {
        return payType;
    }

    // 准备支付
    abstract public void ready();

    // 接受支付访问者
    abstract public void accept(PayVisitor payVisitor);
}