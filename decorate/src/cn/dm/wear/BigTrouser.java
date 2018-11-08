package cn.dm.wear;

public class BigTrouser extends WearDecorate{
    @Override
    protected void wear() {
        this.person.wear();
        System.out.println("大裤子");
    }
}
