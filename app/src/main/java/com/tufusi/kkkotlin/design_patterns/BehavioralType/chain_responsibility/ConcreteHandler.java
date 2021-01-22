package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("请求传递给" + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("请求处理");
        }
    }
}