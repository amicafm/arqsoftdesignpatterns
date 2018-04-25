package designpatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * @author masamiles
 */
public class hello_world {

    public enum Type {
        Java, DesignPattern;
    }

    private static Map<Type, Class<? extends SplitHelloWorldFactory>> map;

    static {
        map = new HashMap<Type, Class<? extends SplitHelloWorldFactory>>();
        map.put(Type.Java, JavaSplitHelloWorldFactory.class);
        map.put(Type.DesignPattern, DesignPatternSplitHelloWorldFactory.class);
    }

    public static SplitHelloWorldFactory select(Type type) throws IllegalAccessException, InstantiationException {
        return map.get(type).newInstance();
    }

}