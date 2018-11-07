package cn.dm.decorate;

/**
 * 装饰类
 */
public class Decorate extends Component {
    protected Component component;


    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (this.component != null) {
            this.component.operation();
        }
    }
}
