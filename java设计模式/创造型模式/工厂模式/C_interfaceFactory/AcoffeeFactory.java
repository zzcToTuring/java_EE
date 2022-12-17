package 创造型模式.工厂模式.C_interfaceFactory;

public class AcoffeeFactory implements coffeeFactory {
    coffee coffee=new Acoffee();
    @Override
    public coffee createcoffee() {
        return coffee;
    }
}
