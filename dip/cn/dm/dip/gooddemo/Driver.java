package cn.dm.dip.gooddemo;

public class Driver implements IDriver{
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void driverCar(ICar iCar) {
        System.out.println(this.name + iCar.run());
    }
}
