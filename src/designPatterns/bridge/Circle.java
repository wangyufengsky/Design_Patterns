package designPatterns.bridge;

import lombok.Builder;

@Builder
public class Circle implements Shape {
    @Override
    public void method() {
        System.out.println("Circle!");
    }
}
