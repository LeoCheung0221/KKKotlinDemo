package com.tufusi.kkkotlin.design_patterns.BehavioralType.template;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
abstract public class AbstractClass {

    // 基本方法
    protected abstract void operation();

    // 模板方法
    public void templateMethod(){
        // 调用基本方法，完成相关的逻辑
        this.operation();
    }
} 