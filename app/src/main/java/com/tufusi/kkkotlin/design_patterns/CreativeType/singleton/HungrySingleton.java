package com.tufusi.kkkotlin.design_patterns.CreativeType.singleton;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    // 构造方法私有，保证外界无法直接实例化
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return singleton;
    }

} 