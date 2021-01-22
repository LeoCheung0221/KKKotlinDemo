package com.tufusi.kkkotlin.design_patterns.BehavioralType.command;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}