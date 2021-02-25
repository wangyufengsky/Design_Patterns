package designPatterns.proxy;

import lombok.Builder;

@Builder
public class Source implements SourceAble {
    @Override
    public void method() {
        System.out.println("Source method!");
    }
}
