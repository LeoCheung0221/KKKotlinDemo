package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 抽象元素角色
 */
abstract public class Element {
    //接受操作
    public abstract void accept(Visitor visitor);
} 