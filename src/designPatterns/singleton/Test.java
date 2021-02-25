package designPatterns.singleton;


public class Test {

    public static void main(String[] args) {
       var singleton=Singleton.getInstance();
       var singleton1=Singleton.getInstance();
       singleton.setNum("123");
       System.out.println(singleton1.getNum());
    }
}
