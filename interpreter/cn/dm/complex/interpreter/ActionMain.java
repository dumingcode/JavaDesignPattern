package cn.dm.complex.interpreter;

public class ActionMain {
    public static void main(String [] args){
        Action failing = new Failing();
        Action success = new Success();

        Man man = new Man();
        man.accept(failing);
        man.accept(success);

        Woman woman = new Woman();
        woman.accept(success);
        woman.accept(failing);

        failing.getManConclusion(man);
        failing.getwoManConclusion(woman);

        success.getManConclusion(man);
        success.getwoManConclusion(woman);
    }
}
