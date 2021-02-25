package designPatterns.observer;

import lombok.Builder;

@Builder
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
