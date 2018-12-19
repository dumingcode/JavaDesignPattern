package cn.dm.mediator;

public class ConcreteMediator extends Mediator {
    private ConcreteColleagueOne concreteColleagueOne;
    private ConcreteColleagueTwo concreteColleagueTwo;

    public ConcreteColleagueOne getConcreteColleagueOne() {
        return concreteColleagueOne;
    }

    public void setConcreteColleagueOne(ConcreteColleagueOne concreteColleagueOne) {
        this.concreteColleagueOne = concreteColleagueOne;
    }

    public ConcreteColleagueTwo getConcreteColleagueTwo() {
        return concreteColleagueTwo;
    }

    public void setConcreteColleagueTwo(ConcreteColleagueTwo concreteColleagueTwo) {
        this.concreteColleagueTwo = concreteColleagueTwo;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleagueOne) {
            concreteColleagueOne.notify(message);
        } else {
            concreteColleagueTwo.notify(message);
        }

    }
}
