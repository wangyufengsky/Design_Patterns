package designPatterns.abstractFactory;

public class SendSmsFactory implements BaseFactory {
    @Override
    public Sender produce() {
        return SmsSender.builder().build();
    }
}
