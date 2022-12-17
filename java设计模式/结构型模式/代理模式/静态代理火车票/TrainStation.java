package 结构型模式.代理模式.静态代理火车票;
//火车站类
public class TrainStation implements SellTicket{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
