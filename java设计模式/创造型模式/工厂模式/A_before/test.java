package 创造型模式.工厂模式.A_before;

public class test {
    public static void main(String[] args) {
        String type="A";
        coffestore store=new coffestore();//创建咖啡店
        coffee coffee=store.orderCoffee(type);
        //咖啡店里面有点咖啡的方法
        System.out.println(coffee.getName());



    }
}
