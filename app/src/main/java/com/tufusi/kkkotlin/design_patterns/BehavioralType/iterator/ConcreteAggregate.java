package com.tufusi.kkkotlin.design_patterns.BehavioralType.iterator;

import java.util.Vector;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ConcreteAggregate implements Aggregate {

    private Vector<Object> vector = new Vector<>();

    public Object getElement(int index) {
        if (index < vector.size()) {
            return vector.get(index);
        } else {
            return null;
        }
    }

    public int size() {
        return vector.size();
    }

    @Override
    public void add(Object object) {
        vector.add(object);
    }

    @Override
    public Iterator creatorIterator() {
        return new ConcreteIterator(this);
    }
}