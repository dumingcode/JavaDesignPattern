package cn.dm.responsibility;

public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("处理请求One " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
