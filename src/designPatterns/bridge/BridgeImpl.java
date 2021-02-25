package designPatterns.bridge;

public class BridgeImpl extends Bridge {
    @Override
    public void method(){
        getColor().method();
        getShape().method();
    }
}
