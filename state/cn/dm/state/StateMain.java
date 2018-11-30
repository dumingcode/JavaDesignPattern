package cn.dm.state;

public class StateMain {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgramme();

        work.setHour(11);
        work.writeProgramme();

        work.setHour(12);
        work.writeProgramme();

        work.setHour(13);
        work.writeProgramme();

        work.setHour(14);
        work.writeProgramme();

        work.setHour(17);
        work.writeProgramme();

        work.setFinish(false);

        work.setHour(19);
        work.writeProgramme();

        work.setHour(22);
        work.writeProgramme();

    }
}
