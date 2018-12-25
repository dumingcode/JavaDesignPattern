package cn.dm.complex.interpreter;

public class Man extends Person {
    @Override
    public void accept(Action vistor) {
        vistor.getManConclusion(this);
    }
}
