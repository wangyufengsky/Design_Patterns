package designPatterns.facade;

public class CaoG {
    private Caog1 caog1;
    private Caog2 caog2;
    private Caog3 caog3;

    public CaoG() {
        caog1=new Caog1();
        caog2=new Caog2();
        caog3=new Caog3();
    }

    public void open(){
        caog1.open();
        caog2.open();
        caog3.open();
    }
}
