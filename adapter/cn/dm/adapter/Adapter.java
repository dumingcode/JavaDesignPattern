package cn.dm.adapter;

public class Adapter implements Target{
    @Override
    public void request() {
        Adaptee adaptee = new Adaptee();
        adaptee.specificRequest();
    }
}
