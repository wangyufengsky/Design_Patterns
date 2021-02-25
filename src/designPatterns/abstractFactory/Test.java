package designPatterns.abstractFactory;

public class Test {

    public static void main(String[] args) {
        var provider=new SendMailFactory();
        var sender=provider.produce();
        sender.Send();
    }
}
