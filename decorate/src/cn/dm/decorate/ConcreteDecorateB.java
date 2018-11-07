package cn.dm.decorate;

public class ConcreteDecorateB extends Decorate{
    @Override
    public void operation() {
        super.operation();
        this.addBehave();
    }

    private void addBehave(){
        System.out.println("B add new behave");
    }

}
