package designPatterns.command;


//命令（Command）模式
//将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
// 命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，
// 司令员的作用是，发出口令，口令经过传递，传到了士兵耳朵里，士兵去执行。
// 这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，只需要做好自己的事儿就行，司令员要的是结果，不会去关注到底士兵是怎么实现的。
public class Test {
    public static void main(String[] args) {
        var receiver = new Receiver();
        var cmd = new MyCommand(receiver);
        var invoker = new Invoker(cmd);
        invoker.action();
    }
}
