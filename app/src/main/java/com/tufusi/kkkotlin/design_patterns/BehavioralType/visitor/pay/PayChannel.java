package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class PayChannel {

    private ABC abc;
    private ICBC icbc;
    private Union union;
    private Alipay alipay;
    private Wechat wechat;
    private Loan loan;
    private Contrary contrary;

    public PayChannel() {
        alipay = new Alipay(0, true);
        wechat = new Wechat(1, true);
        contrary = new Contrary(2, false);
        loan = new Loan(3, false);
        icbc = new ICBC(4, true);
        abc = new ABC(5, true);
        union = new Union(6, true);
    }

    public void accept(PayVisitor payVisitor) {
        alipay.accept(payVisitor);
        wechat.accept(payVisitor);
        contrary.accept(payVisitor);
        loan.accept(payVisitor);
        icbc.accept(payVisitor);
        abc.accept(payVisitor);
        union.accept(payVisitor);
    }
}