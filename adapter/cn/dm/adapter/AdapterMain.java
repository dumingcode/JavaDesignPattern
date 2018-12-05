package cn.dm.adapter;

public class AdapterMain {
    public static void main(String [] args){
        Target target = new Adapter();
        target.request();
    }
}
