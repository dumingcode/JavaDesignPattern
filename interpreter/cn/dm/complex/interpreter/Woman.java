package cn.dm.complex.interpreter;

public class Woman extends Person {
    @Override
    public void accept(Action vistor) {
        vistor.getwoManConclusion(this);
    }
}
