package cn.dm.state;

public class Work {
    private State current;

    public Work() {
        this.current = new ForenoonState();

    }

    private double hour;

    private boolean finish = false;

    public void writeProgramme() {
        current.writePrograme(this);
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public State getState() {
        return current;
    }

    public void setState(State current) {
        this.current = current;
    }
}
