package 反射.动态代理;

public class demo {
    public static void main(String[] args) {
        BigStar bs= new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bs);
        System.out.println(proxy.sing("小黑子"));
        System.out.println("==================");
        proxy.dance();//没有返回值，没必要输出
    }
}
