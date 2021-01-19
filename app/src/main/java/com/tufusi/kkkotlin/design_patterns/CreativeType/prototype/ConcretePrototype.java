package com.tufusi.kkkotlin.design_patterns.CreativeType.prototype;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 具体原型角色
 * 该角色是被复制的对象，必须实现抽象原型接口
 */
public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}