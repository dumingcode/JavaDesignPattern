package cn.dm.dip.baddemo;

public class DipMain {
    public static void main(String[] args) {
        Driver oldDriver = new Driver("dm");
        oldDriver.driver(new Benz());
    }
}
