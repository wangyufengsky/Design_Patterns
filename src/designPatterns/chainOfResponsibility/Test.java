package designPatterns.chainOfResponsibility;




//职责链（Chain of Responsibility）模式
//把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。发出者并不清楚到底最终那个对象会处理该请求，所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。
public class Test {
    public static void main(String[] args) {
        var h1 = MyHandler.builder().name("h1").build();
        var h2 = MyHandler.builder().name("h2").build();
        var h3 = MyHandler.builder().name("h3").build();

        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operator();

    }

}
