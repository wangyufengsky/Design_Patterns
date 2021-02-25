package designPatterns.interpreter;


//解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。一般主要应用在OOP开发中的编译器的开发中
public class Test {
    public static void main(String[] args) {
        // 计算9+2-8的值
        var result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }

}
