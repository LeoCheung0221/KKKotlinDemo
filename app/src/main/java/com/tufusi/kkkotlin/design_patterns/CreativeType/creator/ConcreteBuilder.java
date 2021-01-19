package com.tufusi.kkkotlin.design_patterns.CreativeType.creator;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    // 设置产品零件
    @Override
    public void setPart1() {
        // 为product安装部件1
    }

    @Override
    public void setPart2() {
        // 为product安装部件2
    }

    @Override
    public void setPart3() {
        // 为product安装部件3
    }

    // ... ... 其他部件

    @Override
    public Product builderProduct() {
        return product;
    }
}