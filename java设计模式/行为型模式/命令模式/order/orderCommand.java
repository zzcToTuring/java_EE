package 行为型模式.命令模式.order;

import java.util.Map;
import java.util.Set;

//具体的命令类
public class orderCommand implements command {
    //持有接受者对象
    private chef reciver;//厨师作为接受者对象
    private order order;//订单
    //定义构造方法，具体的命令类
    public orderCommand(chef reciver, order order) {
        this.reciver = reciver;
        this.order = order;
    }
    //实现相关的接口
    @Override
    public void excute() {
        System.out.println("这是"+order.getDiningTables()+"号桌的订单");
        Map<String,Integer> foodDir=order.getFoodDir();//创建相关的菜单集合
        //遍历map集合
        Set<String> keys=foodDir.keySet();
        for (String foodName:keys) {
            reciver.makefood(foodName,foodDir.get(foodName));//制作食物
        }
        System.out.println(order.getDiningTables()+"的订单已经完成。");

    }
}
