package 创造型模式.工厂模式.D_abstractFactory;

public class BDessertFactory implements DessertFactory {
    @Override
    public coffee creatCoffee() {
        return new Bcoffee();
    }

    @Override
    public dessert creatDessert() {
        return new Ddessert();
    }
}
