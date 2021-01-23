package com.tufusi.kkkotlin.design_patterns.BehavioralType.visitor;

import java.util.Random;
import java.util.Vector;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 结构对象角色
 */
public class ObjectStructure {

    private Vector<Element> elements;

    public ObjectStructure() {
        elements = new Vector<>();
    }

    //执行访问操作
    public void action(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

    //添加新元素
    public void add(Element element) {
        elements.add(element);
    }

    // 元素生成器，这里通过一个工厂方法进行模拟
    public void createElements() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextInt(100) > 50) {
                this.add(new ConcreteElement1());
            } else {
                this.add(new ConcreteElement2());
            }
        }
    }
}