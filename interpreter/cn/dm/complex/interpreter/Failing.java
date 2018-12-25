package cn.dm.complex.interpreter;

public class Failing implements Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println("man failing");
    }

    @Override
    public void getwoManConclusion(Woman woman) {
        System.out.println("woman failing");
    }
}
