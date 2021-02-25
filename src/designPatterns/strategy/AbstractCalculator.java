package designPatterns.strategy;

public abstract class AbstractCalculator {
    public int[] split(String exp,String opt){
        var array = exp.split(opt);
        var arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
