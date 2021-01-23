package com.tufusi.kkkotlin.design_patterns.BehavioralType.iterator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public interface Aggregate {
    void add(Object object);
    Iterator creatorIterator();
}

