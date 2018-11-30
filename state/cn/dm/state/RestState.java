package cn.dm.state;

public class RestState extends State {
    @Override
    public void writePrograme(Work work) {
        System.out.println(work.getHour() + "下班回家了");
    }
}
