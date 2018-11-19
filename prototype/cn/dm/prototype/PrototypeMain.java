package cn.dm.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ConcretePrototype p1 = new ConcretePrototype("prototype");
        ConcretePrototype c1 = (ConcretePrototype) p1.clone();
        System.out.println(p1.getId());
        System.out.println(c1.getId());
    }
}
