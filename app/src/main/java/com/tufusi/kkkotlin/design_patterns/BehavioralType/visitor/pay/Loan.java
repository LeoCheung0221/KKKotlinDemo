package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Loan extends BasePay {

    public Loan(int payType, boolean enable) {
        super(payType, enable);
    }

    @Override
    public void ready() {
        if (!enable) {
            return;
        }
        System.out.println("借贷平台准备就绪！");
    }

    @Override
    public void accept(PayVisitor payVisitor) {
        payVisitor.visitLoanPay(this);
    }
}