package com.tufusi.kkkotlin.design_patterns.BehavioralType.iterator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 定义聚集对象，也就是容器
        Aggregate agg = new ConcreteAggregate();
        agg.add("张三");
        agg.add("李四");
        agg.add("王五");

        // 遍历
        Iterator iterator = agg.creatorIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
} 