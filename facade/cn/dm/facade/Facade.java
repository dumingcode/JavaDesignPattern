package cn.dm.facade;

public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        this.subSystemOne.methodOne();
    }

    public void methodB() {
        this.subSystemTwo.methodTwo();
    }

    public void methodC() {
        this.subSystemThree.methodThree();
    }

}
