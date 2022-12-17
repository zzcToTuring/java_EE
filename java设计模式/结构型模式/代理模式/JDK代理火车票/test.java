package 结构型模式.代理模式.JDK代理火车票;

public class test {
    public static void main(String[] args) {
        proxyFactory factory=new proxyFactory();
        SellTicket sellTicket=factory.getProxyObject();
        sellTicket.sell();
    }
}
