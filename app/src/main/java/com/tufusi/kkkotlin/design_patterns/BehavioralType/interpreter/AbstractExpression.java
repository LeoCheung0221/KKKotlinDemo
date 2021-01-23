package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象表达式
 */
abstract public class AbstractExpression {
    // 每个表达式必须有一个解析任务
    public abstract Object interpreter(Context ctx);
} 