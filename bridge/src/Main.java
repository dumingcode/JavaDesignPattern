import cn.dm.bridge.Color;
import cn.dm.bridge.Pen;
import cn.dm.bridge.RedColor;
import cn.dm.bridge.SmallPen;

public class Main {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        Color color = new RedColor();
        pen.setColor(color);
        pen.draw("我的名字是dm");
    }
}
