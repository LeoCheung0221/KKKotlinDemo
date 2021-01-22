package com.tufusi.kkkotlin.design_patterns.BehavioralType.command;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 调用者
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        command.exec();
    }
}