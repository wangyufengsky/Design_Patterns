package designPatterns.strategy;


//策略模式
//定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数
//策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
public class Test {


    public static void main(String[] args) {
        var exp="2+1";
        System.out.println(Plus.builder().build().calculate(exp));
        var exp1="2*5";
        System.out.println(Multiply.builder().build().calculate(exp1));
        var exp2="20-6";
        System.out.println(Minus.builder().build().calculate(exp2));
    }
}
