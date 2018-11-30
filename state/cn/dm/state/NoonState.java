package cn.dm.state;

public class NoonState extends State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 13) {
            System.out.println(work.getHour() + "吃饭犯困午休");
        } else {
            work.setState(new AfternoonState());
            work.writeProgramme();
        }
    }
}
