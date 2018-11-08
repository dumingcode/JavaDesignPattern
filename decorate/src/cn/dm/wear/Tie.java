package cn.dm.wear;

public class Tie extends WearDecorate{
    @Override
    protected void wear() {
        this.person.wear();
        System.out.println("领带");
    }
}
