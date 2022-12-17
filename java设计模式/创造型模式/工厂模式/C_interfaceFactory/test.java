package 创造型模式.工厂模式.C_interfaceFactory;

public class test {
    public static void main(String[] args) {
        //咖啡店对象
        coffestore store=new coffestore();
        coffeeFactory factory=new AcoffeeFactory();
        store.setFactory(factory);
        coffee coffee=store.orderCoffer();
        System.out.println(coffee.getName());



    }
}
