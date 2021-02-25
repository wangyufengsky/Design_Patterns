package designPatterns.bridge;

public class Test {


    public static void main(String[] args) {
        var bridge=new BridgeImpl();
        bridge.setColor(Red.builder().build());
        bridge.setShape(Circle.builder().build());
        bridge.method();
    }

}
