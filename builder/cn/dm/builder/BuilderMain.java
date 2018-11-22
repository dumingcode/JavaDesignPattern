package cn.dm.builder;

public class BuilderMain {
    public static void main(String[] args) {
        PersonBuilder thinPb = new PersonThinBuilder();
        PersonDirector pd = new PersonDirector(thinPb);
        pd.drawPerson();

        PersonBuilder fatPb = new PersonFatBuilder();
        pd = new PersonDirector(fatPb);
        pd.drawPerson();
    }
}
