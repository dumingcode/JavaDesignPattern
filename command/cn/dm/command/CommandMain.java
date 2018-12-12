package cn.dm.command;

public class CommandMain {
    public static void main(String [] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        // invoker相当于服务员类 控制命令执行
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
