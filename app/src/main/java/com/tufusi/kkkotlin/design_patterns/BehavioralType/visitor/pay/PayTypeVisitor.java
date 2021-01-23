package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class PayTypeVisitor implements PayVisitor {

    @Override
    public void visitICBCPay(ICBC icbc) {
        icbc.ready();
    }

    @Override
    public void visitABCPay(ABC abc) {
        abc.ready();
    }

    @Override
    public void visitUnionPay(Union union) {
        union.ready();
    }

    @Override
    public void visitWeChatPay(Wechat wechat) {
        wechat.ready();
    }

    @Override
    public void visitAliPay(Alipay alipay) {
        alipay.ready();
    }

    @Override
    public void visitLoanPay(Loan loan) {
        loan.ready();
    }

    @Override
    public void visitPubContraryPay(Contrary contrary) {
        contrary.ready();
    }
}