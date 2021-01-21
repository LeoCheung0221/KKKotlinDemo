package com.tufusi.kkkotlin.design_patterns.StructuralType.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(String intrinsicState) {
        Flyweight flyweight = pool.get(intrinsicState);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return flyweight;
    }
} 