package 行为型模式.命令模式.order;

public class test {
    public static void main(String[] args) {
        //1、创建订单对象
        order order1=new order();
        order1.setDiningTables(1);//餐桌号1
        order1.setFood("土豆丝",1);
        order1.setFood("雪碧",2);
        order order2=new order();
        order2.setDiningTables(2);//餐桌号2
        order2.setFood("小炒肉",1);
        order2.setFood("果粒橙",2);
        //创建厨师对象
        chef chef=new chef();
        //具体的订单
        orderCommand orderCommand1=new orderCommand(chef,order1);
        orderCommand orderCommand2=new orderCommand(chef,order2);
        //服务员
        waiter waiter=new waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);
        waiter.say();
//里面使用到hashmap方法，在order里面主要是用来存放订单的名称和份数
//waiter里面使用list列表，由服务员进行业务的添加，因为有的时候不仅仅只有一个订单，会存在多个订单的情况，使用ArrayList进行存放，最后再输出
    }
}
