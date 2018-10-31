package cn.dm.bridge;

public class GreenColor implements Color{
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + ".");
    }
}
