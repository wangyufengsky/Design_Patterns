package designPatterns.simpleFactoryPattern;

public class Test {


    public static void main(String[] args) {
        var sender=SendFactory.produceMail();
        sender.Send();
    }

}
