package cn.dm.bridge;

public class RedColor implements Color{
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "红色的" + name + ".");
    }
}
