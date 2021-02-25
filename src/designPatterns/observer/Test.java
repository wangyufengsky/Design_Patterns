package designPatterns.observer;


//观察者（Observer）模式
//多个对象间存在一对多关系，当一个对象发生改变时，会把这种改变通知给其他多个对象，从而影响其他对象的行为。
//MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，当MySubject变化时，Observer1和Observer2必然变化。
// AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
public class Test {

    public static void main(String[] args) {
        var sub = new MySubject();
        sub.add(Observer1.builder().build());
        sub.add(Observer2.builder().build());
        sub.operation();
    }
}
