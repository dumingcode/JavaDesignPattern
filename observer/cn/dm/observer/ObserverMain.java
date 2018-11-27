package cn.dm.observer;

public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver("No1", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("No2", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("No3", concreteSubject));
        concreteSubject.setSubjectState("上车!");
        concreteSubject.notifyObservers();

    }
}
