package cn.dm.state;

public class AfternoonState extends State {
    @Override
    public void writePrograme(Work work) {
        if (work.getHour() < 17) {
            System.out.println(work.getHour() +"下午状态不错继续coding");
        } else {
            work.setState(new EveningState());
            work.writeProgramme();
        }
    }
}
