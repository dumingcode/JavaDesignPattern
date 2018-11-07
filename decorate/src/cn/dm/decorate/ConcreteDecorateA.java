package cn.dm.decorate;

public class ConcreteDecorateA extends Decorate{

    private String addedState;
    @Override
    public void operation() {
        super.operation();
        this.addedState="New State";
        System.out.println("A的操作"+addedState);
    }
}
