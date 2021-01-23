package com.tufusi.kkkotlin.design_patterns.BehavioralType.state;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象状态角色
 */
abstract public class State {
    // 定义一个环境角色
    protected Context context;

    // 设置环境
    public void setContext(Context context) {
        this.context = context;
    }

    // 抽象行为
    public abstract void handle();
}