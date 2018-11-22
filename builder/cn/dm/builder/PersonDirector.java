package cn.dm.builder;

/**
 * 模板方法
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void drawPerson() {
        this.pb.buildHead();
        this.pb.buildBody();
        this.pb.buildArmLeft();
        this.pb.buildArmRight();
        this.pb.buildLegLeft();
        this.pb.buildLegRight();
    }
}
