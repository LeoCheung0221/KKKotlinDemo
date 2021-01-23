package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class NonterminalExpression extends AbstractExpression {

    // 每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(AbstractExpression expression){
    }

    @Override
    public Object interpreter(Context ctx) {
        // 进行语法处理
        return null;
    }
}