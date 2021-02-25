package designPatterns.chainOfResponsibility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class AbstractHandler {
    private Handler handler;
}
