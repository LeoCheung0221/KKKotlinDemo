package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor.pay;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Test {
    public static void main(String[] args) {
        PayChannel channel = new PayChannel();
        PayTypeVisitor typeVisitor = new PayTypeVisitor();
        channel.accept(typeVisitor);
    }
} 