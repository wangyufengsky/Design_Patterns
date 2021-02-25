package designPatterns.state;


//状态（State）模式
//允许一个对象在其内部状态发生改变时改变其行为能力。比如QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，
public class Test {
    public static void main(String[] args) {

        var state = new State();
        var context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }

}
