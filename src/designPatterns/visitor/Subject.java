package designPatterns.visitor;

public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
