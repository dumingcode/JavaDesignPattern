package cn.dm.decorate;

public class DecorateMain {
    public static void main(String [] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecorateA d1 = new ConcreteDecorateA();
        ConcreteDecorateB b1 = new ConcreteDecorateB();
        d1.setComponent(c);
        b1.setComponent(d1);
        b1.operation();
    }
}
