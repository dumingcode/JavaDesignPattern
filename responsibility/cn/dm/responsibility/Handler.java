package cn.dm.responsibility;

public abstract class Handler {
     protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    // 处理请求的抽象方法
    public abstract void handleRequest(int request);
}
