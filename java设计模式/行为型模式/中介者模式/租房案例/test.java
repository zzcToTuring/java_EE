package 行为型模式.中介者模式.租房案例;

public class test {
    public static void main(String[] args) {
        //构建中介者对象
        TrueMediator trueMediator=new TrueMediator();
        //构建房主
        HouseOwn houseOwn1=new HouseOwn("张三-房东",trueMediator);
        //构建租房者
        tenant tenant1=new tenant("李四-租客",trueMediator);

        //把租客的信息都添加到中介里
        trueMediator.setHouseOwn(houseOwn1);
        trueMediator.setTenant(tenant1);

        tenant1.constact("我要租房");
        houseOwn1.constact("没房子");
    }
}
