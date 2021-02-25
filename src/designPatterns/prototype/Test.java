package designPatterns.prototype;

public class Test {
    public static void main(String[] args) {
        try {
            var prototype= (Prototype) Prototype.builder().string("new prototype").build().clone();
            System.out.println(prototype.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
