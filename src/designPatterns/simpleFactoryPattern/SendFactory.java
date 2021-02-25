package designPatterns.simpleFactoryPattern;

public class SendFactory {

    public static Sender produceMail(){
        return MailSender.builder().build();
    }

    public static Sender produceSms(){
        return SmsSender.builder().build();
    }
}
