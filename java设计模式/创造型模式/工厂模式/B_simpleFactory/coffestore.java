package 创造型模式.工厂模式.A_before.B_simpleFactory;

public class coffestore {
    public coffee ordercoffee(String type){
        simpleCoffeeFsctory factory=new simpleCoffeeFsctory();
        //调用方法生产咖啡
        coffee coffee=factory.creatCoffee(type);

        coffee.add_sugar();
        coffee.add_milk();
        return coffee;
    }
}
/*
静态工厂模式，同样也不属于23种设计模式中的一种
他的区别是将工厂类中的create方法变为static
在coffeestore中的调用方法发生相应的变化
coffee coffee=simpleCoffeeFsctory.creatCoffee(type);
 */