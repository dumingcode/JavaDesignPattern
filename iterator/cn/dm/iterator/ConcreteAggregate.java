package cn.dm.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate {
    private List<T> items = new ArrayList<T>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public T getIndex(int index) {
        return items.get(index);
    }

    public void insert(T val, int index) {
        items.add(index, val);
    }

}
