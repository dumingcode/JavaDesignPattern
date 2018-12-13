package cn.dm.responsibility;

public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("处理请求Three" + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
