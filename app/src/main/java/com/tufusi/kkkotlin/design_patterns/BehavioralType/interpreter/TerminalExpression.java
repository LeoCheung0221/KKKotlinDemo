package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class TerminalExpression extends AbstractExpression {

    // 通常终结符表达式只有换一个，但是有多个对象
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}