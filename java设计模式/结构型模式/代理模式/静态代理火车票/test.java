package 结构型模式.代理模式.静态代理火车票;
//从上面的对象中可以看出测试类直接访问的是proxypoint类对象，也就是说
//proxypoint作为访问目标对象的中介，同时也对sell方法进行了增强（比如收取了代理的费用）
public class test {
    public static void main(String[] args) {
        proxyPoint proxyPoint=new proxyPoint();
        proxyPoint.sell();
    }
}
