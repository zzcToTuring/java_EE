package 行为型模式.策略模式.促销案例;

public class test {
    public static void main(String[] args) {
        //某个时间段，使用策划活动A
        salesman man=new salesman(new strategyA());
        man.salesmanshow();
        System.out.println("=========================");
        //使用促销活动B进行操作
        man.setMan(new strategyB());
        man.salesmanshow();
    }
}
