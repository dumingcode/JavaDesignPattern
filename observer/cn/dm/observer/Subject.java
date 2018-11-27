package cn.dm.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observerList = new ArrayList<Observer>(); //面向抽象编程

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers() {
        this.observerList.stream().forEach((obj) -> {
            obj.update();
        });
    }


}
