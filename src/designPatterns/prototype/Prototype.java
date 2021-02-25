package designPatterns.prototype;

import jdk.jfr.DataAmount;
import lombok.*;

import java.io.*;

@Builder @AllArgsConstructor @ToString
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    @Getter @Setter
    private String string;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

