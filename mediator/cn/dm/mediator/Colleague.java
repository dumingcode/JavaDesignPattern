package cn.dm.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
