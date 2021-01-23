package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ABC extends BasePay {

    public ABC(int payType, boolean enable) {
        super(payType, enable);
    }

    @Override
    public void ready() {
        if (!enable) {
            return;
        }
        System.out.println("农行支付准备就绪！");
    }

    @Override
    public void accept(PayVisitor payVisitor) {
        payVisitor.visitABCPay(this);
    }
}