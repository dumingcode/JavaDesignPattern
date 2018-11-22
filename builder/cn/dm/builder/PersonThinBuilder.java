package cn.dm.builder;

public class PersonThinBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("head thin");
    }

    @Override
    public void buildBody() {
        System.out.println("body thin");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("arm left thin");
    }

    @Override
    public void buildArmRight() {
        System.out.println("arm right thin");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("leg left thin");
    }

    @Override
    public void buildLegRight() {
        System.out.println("leg right thin");
    }
}
