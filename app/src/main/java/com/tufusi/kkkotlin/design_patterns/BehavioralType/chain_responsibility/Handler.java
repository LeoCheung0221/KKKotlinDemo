package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
abstract public class Handler {
    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}