package com.tufusi.kkkotlin.design_patterns.CreativeType.prototype;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description 客户角色
 * 该角色提出创建对象的请求
 */
public class Client {

    public void operation(Prototype prototype) {
        // 得到prototype的副本
        Prototype clone = prototype.clone();
    }
} 