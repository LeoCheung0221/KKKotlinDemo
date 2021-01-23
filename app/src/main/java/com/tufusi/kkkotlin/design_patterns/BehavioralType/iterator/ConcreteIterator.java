package com.tufusi.kkkotlin.design_patterns.BehavioralType.iterator;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;
    private int index;
    private int size;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.aggregate = agg;
        size = agg.size();
        index = 0;
    }

    @Override
    public Object next() {
        if (index < size) {
            return aggregate.getElement(index++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }
}