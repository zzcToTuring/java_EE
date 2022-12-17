package 创造型模式.工厂模式.C_interfaceFactory;

public abstract class coffee {
    public void add_milk(){
        System.out.println("加奶");
    }
    public abstract String getName();
    public void add_sugar(){
        System.out.println("加糖");
    }
}
