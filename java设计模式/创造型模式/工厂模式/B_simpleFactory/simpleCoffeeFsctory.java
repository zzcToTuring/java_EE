package 创造型模式.工厂模式.A_before.B_simpleFactory;
//简单咖啡工厂
public class simpleCoffeeFsctory {
    public static coffee creatCoffee(String type){
        coffee coffee=null;
        if ("A".equals(type)){
            coffee=new Acoffee();
        }
        else if ("B".equals(type)){
            coffee=new Bcoffee();
        }
        //添加的C类咖啡，只需要在工厂里面进行修改即可
        else if ("C".equals(type)){
            coffee=new ccoffee();
        }
        else{
            throw new RuntimeException("对不起，没有这种咖啡");
        }
        return coffee;
    }
}
