package 创造型模式.工厂模式.D_abstractFactory;
//A类的甜品工厂
public class ADessertFactory implements DessertFactory{

    @Override
    public coffee creatCoffee() {
        return new Acoffee();
    }

    @Override
    public dessert creatDessert() {
        return new Cdessert();
    }
}
