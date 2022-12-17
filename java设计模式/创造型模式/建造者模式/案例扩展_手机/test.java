package 创造型模式.建造者模式.案例扩展_手机;

public class test {
    public static void main(String[] args) {
        //不能直接创建，用builder里面的方法进行创建
        //首先 phone里面的builder里面有一些screen、CPU方法，用来定制CPU
        //最后使用里面的builder里面的build方法，完成对象的创建
        phone phone=new phone.builder()
                .screen("A")
                .cpu("B")
                .memory("C")
                .build();
        System.out.println(phone);
    }
}
