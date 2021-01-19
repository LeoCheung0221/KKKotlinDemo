package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProduct.class);
        /**
         * 继续业务逻辑处理
         */
        product.method1();
        product.method2();
    }
} 