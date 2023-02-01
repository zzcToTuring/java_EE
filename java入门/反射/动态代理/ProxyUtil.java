package 反射.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//创建动态代理
public class ProxyUtil {
    public static Star createProxy(BigStar star){
        /*
        public static Object newProxyInstance(Classloader loader, Class<?>11 interfaces, InvocationHandler h)
        参数一:用于指定用哪个类加戟器，去加载生成的代理类
        参数二:指定接口，,这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三:用来指定生成的代理对象要干什么事情
        */
        Object o = Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一，用于指定用哪个类加载器，一般都是固定的写法
                new Class[] {Star.class},//指定接口，这些接口用于指定生成什么代理，可以有很多因此写成数组
                //参数3，用来指定生成代理对象要干嘛
                new InvocationHandler() {
                    @Override
                    /*
                    参数1：代理的对象
                    参数2：运行的方法 method是反射中的Method
                    参数3：调用方法的时候传递的实参
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("sing".equals(method.getName())) {
                            System.out.println("star 唱歌前的准备工作");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("star 跳舞前的准备工作");
                        }
                        //为什么要return 因为可能有一些是有返回值的
                        return method.invoke(star, args);
                    }
                }

        );
        return (Star) o;
    }
}
