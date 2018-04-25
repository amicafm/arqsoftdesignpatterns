package designpatterns;

import designpatterns.SplitHelloWorld;

/**
 * @author masamiles
 */
public interface SplitHelloWorldFactory {

    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection();

    public SplitHelloWorld.HelloWorldObject createHelloWorldObject();
}