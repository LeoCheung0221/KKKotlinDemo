package com.tufusi.kkkotlin.design_patterns.CreativeType.factory.simple;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 具体工厂角色
 * 该角色实现了抽象工厂接口，含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象
 */
public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T factory(Class<T> cls) {
        Product product = null;
        try {
            // 通过反射获取指定类对象
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}