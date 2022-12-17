package 结构型模式.代理模式.JDK代理火车票;
//获取代理对象的工厂类
//需要在有接口的情况下使用
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyFactory {
    //声明目标对象-火车站对象
    private TrainStation trainStation = new TrainStation();

    //代理类也实现了对应的接口
    public SellTicket getProxyObject() {

        //返回代理对象
        SellTicket proxyObject = (SellTicket) Proxy.newProxyInstance(
                /*三个参数
        ClassLoader loader,代理对象，和proxyObject对象是同一个对象，在invoke方法中基本不用
        Class<?>[] interfaces,对接口中的方法进行封装的method方法
        InvocationHandler h，调用方法的实际参数
         */
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    //使用反射的方法，将对象带入
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk动态代理");
                        System.out.println("代收点买票，收取一定的费用");
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
