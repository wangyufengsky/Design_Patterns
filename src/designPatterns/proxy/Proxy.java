package designPatterns.proxy;




public class Proxy implements SourceAble {
    private final Source source;

    public Proxy(){
        super();
        this.source = Source.builder().build();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }
    private void after() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }

}
