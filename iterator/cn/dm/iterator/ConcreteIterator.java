package cn.dm.iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getIndex(0);
    }

    @Override
    public Object next() {
        if (!isDone()) {
            return aggregate.getIndex(current++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.getIndex(current);
    }
}
