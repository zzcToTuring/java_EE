package 行为型模式.访问者模式.打分案例;

public class test {
    public static void main(String[] args) {
        //创建容器
        objectstructure objectstructure1=new objectstructure();
        objectstructure1.addperson(new man("张三"));
        objectstructure1.addperson(new women("赵四"));

        objectstructure objectstructure2=new objectstructure();
        objectstructure2.addperson(new man("李四"));
        objectstructure2.addperson(new man("王五"));
        objectstructure2.addperson(new women("大脚"));

        //创建通过与不通过的行为（action实现类）
        success success=new success();
        fail fail=new fail();

        objectstructure1.display(success);
        objectstructure2.display(fail);
    }
}
