package com.tufusi.kkkotlin.design_patterns.BehavioralType.interpreter.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Variables {

    Map<Variable, Integer> v = new HashMap<>();

    public void put(Variable variable, int value) {
        v.put(variable, value);
    }

    public int get(Variable variable){
        return v.get(variable);
    }
} 