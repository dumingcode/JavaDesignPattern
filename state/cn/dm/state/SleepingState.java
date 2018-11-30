package cn.dm.state;

public class SleepingState extends State {
    @Override
    public void writePrograme(Work work) {
        System.out.println(work.getHour() + "睡觉了");
    }
}
