package cn.dm.singleton;

public class SingleThreadTwo {
    private static SingleThreadTwo instance;

    private SingleThreadTwo() {

    }

    // 双重同步锁
    public static synchronized SingleThreadTwo getInstance() {
        if (instance == null) {
            synchronized (SingleThreadTwo.class) {
                if (instance == null) {
                    instance = new SingleThreadTwo();
                }
            }
        }
        return instance;
    }
}
