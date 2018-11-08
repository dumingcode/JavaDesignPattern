package cn.dm.wear;

public class WearDecorate extends Person {
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    protected void wear() {
        this.person.wear();
    }
}
