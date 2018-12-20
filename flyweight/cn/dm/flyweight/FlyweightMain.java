package cn.dm.flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        int ext = 22;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweightX = flyweightFactory.getFlyweightInstance("X");
        flyweightX.operation(--ext);
        Flyweight flyweightY = flyweightFactory.getFlyweightInstance("Y");
        flyweightY.operation(--ext);
        Flyweight flyweightZ = flyweightFactory.getFlyweightInstance("Z");
        flyweightZ.operation(--ext);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operation(--ext);


    }
}
