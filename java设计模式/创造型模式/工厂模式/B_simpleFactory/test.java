package 创造型模式.工厂模式.A_before.B_simpleFactory;

public class test {
    public static void main(String[] args) {
        String type="C";
        coffestore store=new coffestore();
        coffee c=store.ordercoffee(type);
        System.out.println(c.getName());
    }
}
