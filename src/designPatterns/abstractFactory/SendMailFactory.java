package designPatterns.abstractFactory;

public class SendMailFactory implements BaseFactory {
    @Override
    public Sender produce() {
        return MailSender.builder().build();
    }
}
