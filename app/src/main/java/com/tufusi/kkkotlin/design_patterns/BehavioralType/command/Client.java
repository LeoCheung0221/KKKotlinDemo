package com.tufusi.kkkotlin.design_patterns.BehavioralType.command;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 一个角色命令另一个角色执行动作
 */
public class Client {
    public static void main(String[] args) {
        // 调用者
        Invoker invoker = new Invoker();
        // 接收者
        Receiver receiver = new Receiver();
        // 定义一个发送给接收者的命令
        Command command = new ConcreteCommand(receiver);
        // 执行
        invoker.setCommand(command);
        invoker.action();
    }
} 