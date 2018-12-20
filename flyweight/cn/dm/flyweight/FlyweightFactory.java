package cn.dm.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public FlyweightFactory() {
        this.flyweightMap.put("X",new ConcreteFlyweight());
        this.flyweightMap.put("Y",new ConcreteFlyweight());
        this.flyweightMap.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweightInstance(String key){
        return flyweightMap.get(key);
    }
}
