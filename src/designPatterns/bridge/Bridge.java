package designPatterns.bridge;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public abstract class Bridge {
    @Getter @Setter
    private Color color;
    @Getter @Setter
    private Shape shape;

    public void method(){
        color.method();
        shape.method();
    }
}
