package cn.dm.complex.interpreter;

public class Success implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("man success");
    }

    @Override
    public void getwoManConclusion(Woman woman) {
        System.out.println("woman success");
    }
}
