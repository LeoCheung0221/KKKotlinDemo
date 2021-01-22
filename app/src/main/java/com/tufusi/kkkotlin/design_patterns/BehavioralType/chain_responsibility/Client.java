package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setSuccessor(h2);
        h1.handleRequest();
    }
} 