package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        // 生成元素
        os.createElements();
        // 创建一个访问者对象
        Visitor visitor = new ConcreteVisitor();
        // 访问者对结构进行访问（执行访问）
        os.action(visitor);
    }
} 