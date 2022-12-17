package 创造型模式.原型模式.案例2_浅克隆bug;

public class good implements Cloneable{
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
    public good clone() throws CloneNotSupportedException{
        return (good) super.clone();
        //父类的类型是object，我们需要的是good类型，因此需要进行强制类型转换
    }
}
