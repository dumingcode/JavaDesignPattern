package cn.dm.singleton;

public class SingletonThreadOne {
    private static SingletonThreadOne instance;

    private SingletonThreadOne() {

    }

    //同步方法
    public static synchronized SingletonThreadOne getInstance() {
        if (instance == null) {
            instance = new SingletonThreadOne();
        }
        return instance;
    }
}
