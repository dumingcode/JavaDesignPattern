package cn.dm.bridge;

public class BlackColor implements Color{
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "黑色的" + name + ".");
    }
}
