package 创造型模式.工厂模式.C_interfaceFactory;

public class BcoffeeFactory implements coffeeFactory{
    @Override
    public coffee createcoffee() {
        return new Bcoffee();
    }
}
