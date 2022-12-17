package 创造型模式.原型模式.案例三_深克隆;

public class good implements Cloneable {
    private student stu;
    public student getStu() {
        return stu;
    }
    public void setStu(student stu) {
        this.stu = stu;
    }
    public void show(){
        System.out.println(stu.getName()+"获得三好学生的奖状");
    }
    //重写克隆的方法
    public good clone() throws CloneNotSupportedException{
        Object deep=null;
        deep=super.clone();//基本类型的克隆，本身也就是return super.clone()方法完成克隆
        good good=(good) deep;//创建深克隆对象deep，将deep强行转化为good类的对象
        good.stu=(student) stu.clone();//将之前的student中的super方法进行克隆
        return (good) deep;//已经复制好了deep，将其返回
        //父类的类型是object，我们需要的是good类型，因此需要进行强制类型转换
//        good deep=(good) super.clone();
//        good good=(good) deep;
//        good.stu=(student) stu.clone();
//        return deep;
    }
}
