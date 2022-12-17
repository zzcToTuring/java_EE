package 创造型模式.原型模式.案例2_浅克隆bug;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象
        good stu1=new good();
        student student=new student();
        student.setName("张三");
        stu1.setStu(student);
        //奖状的克隆
        good stu2=stu1.clone();
        stu2.getStu().setName("李四");
        stu1.show();
        stu2.show();



    }
}
