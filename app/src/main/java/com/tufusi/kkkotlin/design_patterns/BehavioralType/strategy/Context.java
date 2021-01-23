package com.tufusi.kkkotlin.design_patterns.BehavioralType.strategy;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 上下文环境角色
 */
public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 调用策略方法
    public void contextInterface() {
        strategy.strategyInterface();
    }
}