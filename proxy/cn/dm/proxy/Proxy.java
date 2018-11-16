package cn.dm.proxy;

public class Proxy implements Subject{
    private Subject realSubject;
    @Override
    public void request() {
        if(this.realSubject ==null){
            this.realSubject = new RealSubject();
        }
        this.realSubject.request();
    }
}
