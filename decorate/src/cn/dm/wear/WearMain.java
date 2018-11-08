package cn.dm.wear;

public class WearMain {
    public static void main(String[] args) {
        Person person = new Person();
        Tie tie = new Tie();
        TShirt tShirt = new TShirt();
        BigTrouser big = new BigTrouser();

        tie.setPerson(person);
        tShirt.setPerson(tie);
        big.setPerson(tShirt);
        big.wear();
    }
}
