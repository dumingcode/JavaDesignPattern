package cn.dm.builder;

public class PersonFatBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("head fat");
    }

    @Override
    public void buildBody() {
        System.out.println("body fat");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("arm left fat");
    }

    @Override
    public void buildArmRight() {
        System.out.println("arm right fat");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("leg left fat");
    }

    @Override
    public void buildLegRight() {
        System.out.println("leg right fat");
    }
}
