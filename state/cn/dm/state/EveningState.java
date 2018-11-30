package cn.dm.state;

public class EveningState extends State {
    @Override
    public void writePrograme(Work work) {
        if (work.isFinish()) {
            //休息
            work.setState(new RestState());
            work.writeProgramme();
        } else {
            if (work.getHour() < 21) {
                System.out.println(work.getHour() + "加班");
            } else {
                work.setState(new SleepingState());
                work.writeProgramme();
            }
        }
    }
}
