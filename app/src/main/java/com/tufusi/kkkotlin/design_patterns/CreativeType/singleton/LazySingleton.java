package com.tufusi.kkkotlin.design_patterns.CreativeType.singleton;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class LazySingleton {

    private static volatile LazySingleton singleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
} 