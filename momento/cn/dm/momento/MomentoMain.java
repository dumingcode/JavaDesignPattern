package cn.dm.momento;

public class MomentoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        System.out.println("初始值");
        originator.setState("ON");
        originator.show();

        Caretaker ck = new Caretaker();
        ck.setMomento(originator.saveMomento());
        System.out.println("修改值");
        originator.setState("OFF");
        originator.show();

        System.out.println("恢复");
        originator.restoreMomento(ck.getMomento());
        originator.show();


    }
}
