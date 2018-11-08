package cn.dm.wear;

public class TShirt extends WearDecorate{
    @Override
    protected void wear() {
        this.person.wear();
        System.out.println("Tshirt");
    }
}
