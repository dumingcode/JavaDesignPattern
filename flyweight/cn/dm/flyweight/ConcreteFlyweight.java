package cn.dm.flyweight;

public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体的flyweight" + extrinsicstate);
    }
}
