package cn.dm.state;

public class ForenoonState extends State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 12) {
            System.out.println(work.getHour() + "上午工作精神百倍");
        } else {
            work.setState(new NoonState());
            work.writeProgramme();
        }
    }
}
