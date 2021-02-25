package designPatterns.memento;




//备忘录（Memento）模式
//在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
public class Test {



    public static void main(String[] args) {

        // 创建原始类
        var origi = new Original("egg");

        // 创建备忘录
        var storage = new Mementos(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }

}
