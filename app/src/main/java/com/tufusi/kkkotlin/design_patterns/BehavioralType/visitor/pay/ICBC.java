package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ICBC extends BasePay {

    public ICBC(int payType, boolean enable) {
        super(payType, enable);
    }

    @Override
    public void ready() {
        if (!enable) {
            return;
        }
        System.out.println("工商银行准备就绪！");
    }

    @Override
    public void accept(PayVisitor payVisitor) {
        payVisitor.visitICBCPay(this);
    }
}