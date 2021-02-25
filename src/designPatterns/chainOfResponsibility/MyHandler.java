package designPatterns.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder @AllArgsConstructor
public class MyHandler extends AbstractHandler implements Handler {

    @Getter
    private final String name;

    @Override
    public void operator() {
        System.out.println(name+" deal!");
        if(null!=getHandler()){
            getHandler().operator();
        }
    }

}
