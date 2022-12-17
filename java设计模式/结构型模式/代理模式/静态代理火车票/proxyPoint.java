package 结构型模式.代理模式.静态代理火车票;
//代售点
public class proxyPoint implements SellTicket{
    //声明火车站类对象

    private TrainStation trainStation=new TrainStation();
    @Override
    public void sell() {
        System.out.println("代理点卖票，收取一定的费用");
        trainStation.sell();
    }
}
