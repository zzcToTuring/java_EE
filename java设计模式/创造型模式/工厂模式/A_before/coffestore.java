package 创造型模式.工厂模式.A_before;

public class coffestore {
    public coffee orderCoffee(String type){
        coffee coffee=null;
        if ("A".equals(type)){
            coffee=new Acoffee();
        }
        else if ("B".equals(type)){
            coffee=new Bcoffee();
        }
        else {
            throw new RuntimeException("对不起，没有这样的咖啡");
        }
        coffee.add_milk();
        coffee.add_sugar();
    return coffee;
    }


}
