package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 抽象工厂角色
 * 该角色是工厂方法的核心，与应用系统无关，任何在创建对象的工厂类都必须实现该接口
 */
public interface Creator {

    /**
     * 工厂方法
     * 创建一个产品对象，其输入参数类型可以自行设置
     */
    <T extends Product> T factory(Class<T> cls);

}

