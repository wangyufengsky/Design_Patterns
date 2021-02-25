package designPatterns.memento;

public class Mementos {
    private Memento memento;

    public Mementos(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
