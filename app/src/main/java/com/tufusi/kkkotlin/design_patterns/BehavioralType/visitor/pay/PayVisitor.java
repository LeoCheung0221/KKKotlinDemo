package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

import com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo.Cpu;
import com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.demo.HardDisk;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 代表计算机硬件的访问者
 */
public interface PayVisitor {
    void visitICBCPay(ICBC icbc); // 访问工商银行
    void visitABCPay(ABC abc); // 访问农行
    void visitUnionPay(Union union); // 访问银联
    void visitWeChatPay(Wechat wechat); // 访问微信
    void visitAliPay(Alipay alipay); // 访问支付宝
    void visitLoanPay(Loan loan); // 访问P2P贷款
    void visitPubContraryPay(Contrary contrary); // 访问对公转账
}