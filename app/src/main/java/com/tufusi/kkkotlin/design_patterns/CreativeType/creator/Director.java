package com.tufusi.kkkotlin.design_patterns.CreativeType.creator;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 导演者角色
 * 该角色负责安排已有模块的顺序，然后告诉Builder开始构建
 * 导演者类起到封装作用，避免高层模块深入到建造者内部的实现类。
 * 导演类可以有多个，根据项目的实际情况来决定使用的个数
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    // 构造产品，负责调用各个零件建造方法
    public Product build() {
        builder.setPart1();
        builder.setPart2();
        builder.setPart3();

        // ...... 其他部件

        return builder.builderProduct();
    }

} 