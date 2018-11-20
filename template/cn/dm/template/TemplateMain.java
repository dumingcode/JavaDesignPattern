package cn.dm.template;


public class TemplateMain {
    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();

        ConcreteClassB concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();
    }

}
