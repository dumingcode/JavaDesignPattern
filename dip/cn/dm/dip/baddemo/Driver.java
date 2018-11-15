package cn.dm.dip.baddemo;

/**
 * 依赖倒转原则坏的实现方式
 */
public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void driver(Benz benz) {
        System.out.println(this.name + benz.run());
    }

}
