package cn.dm.responsibility;

public class HandlerMain {
    public static void main(String[] args) {
        Handler handlerOne = new ConcreteHandlerOne();
        Handler handlerTwo = new ConcreteHandlerTwo();
        Handler handlerThree = new ConcreteHandlerThree();
        handlerOne.setSuccessor(handlerTwo);
        handlerTwo.setSuccessor(handlerThree);
        handlerOne.handleRequest(8);
        handlerOne.handleRequest(15);
        handlerOne.handleRequest(25);
    }
}
