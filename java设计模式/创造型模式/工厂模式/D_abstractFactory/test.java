package 创造型模式.工厂模式.D_abstractFactory;

public class test {
    public static void main(String[] args) {
        //创建一个B类的甜品工厂
        BDessertFactory factory=new BDessertFactory();
        //B类的甜品工厂对应B类咖啡和D类的甜品
        // 要是换了一种口味，就直接在这里发生变化 ADessertFactory factory=new ADessertFactory();
        coffee coffeeB=factory.creatCoffee();
        dessert dessertD=factory.creatDessert();
        System.out.println(coffeeB.getName());
        dessertD.show();

    }
}
