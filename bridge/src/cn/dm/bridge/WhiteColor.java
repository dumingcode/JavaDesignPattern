package cn.dm.bridge;

public class WhiteColor implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "白色的" + name + ".");
    }
}
