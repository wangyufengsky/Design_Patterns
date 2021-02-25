package designPatterns.bridge;

import lombok.Builder;

@Builder
public class Red implements Color {
    @Override
    public void method() {
        System.out.println("Red!");
    }
}
