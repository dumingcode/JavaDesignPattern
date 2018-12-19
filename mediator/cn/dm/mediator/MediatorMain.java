package cn.dm.mediator;

public class MediatorMain {
    public static void main(String [] args){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleagueOne concreteColleagueOne = new ConcreteColleagueOne(concreteMediator);
        ConcreteColleagueTwo concreteColleagueTwo = new ConcreteColleagueTwo(concreteMediator);
        concreteMediator.setConcreteColleagueOne(concreteColleagueOne);
        concreteMediator.setConcreteColleagueTwo(concreteColleagueTwo);
        concreteColleagueOne.send("我是同事1");
        concreteColleagueTwo.send("我是同事2");
    }
}
