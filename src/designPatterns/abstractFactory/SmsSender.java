package designPatterns.abstractFactory;

import lombok.Builder;

@Builder
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is smsSender!");
    }
}
