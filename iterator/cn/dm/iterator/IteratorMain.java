package cn.dm.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate ca = new ConcreteAggregate();
        ca.insert("hello0", 0);
        ca.insert("hello1", 1);
        ca.insert("hello2", 2);
        ca.insert("hello3", 3);
        ca.insert("hello4", 4);

        Iterator iter = new ConcreteIterator(ca);
        while (!iter.isDone()) {
            System.out.println(iter.next());
        }
    }
}
