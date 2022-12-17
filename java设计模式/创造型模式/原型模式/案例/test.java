package 创造型模式.原型模式.案例;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        good stu1=new good();
        //奖状的克隆
        stu1.setName("张三");
        stu1.show();
        good stu2=stu1.clone();

        System.out.println(stu2.getName());;
    }
}
