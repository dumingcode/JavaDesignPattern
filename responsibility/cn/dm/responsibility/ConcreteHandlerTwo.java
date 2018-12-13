package cn.dm.responsibility;

public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("处理请求Two" + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
