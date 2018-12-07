package cn.dm.momento;

public class Originator {
    private String state;

    // 创建备忘录，将当前需要保存的信息导入并实例化出一个Momento对象
    public Momento saveMomento() {
        return new Momento(state);
    }

    // 恢复备忘录，将Momento导入并将相关数据恢复
    public void restoreMomento(Momento momento) {
        this.state = momento.getState();
    }

    public void show() {
        System.out.println("State=" + this.state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
