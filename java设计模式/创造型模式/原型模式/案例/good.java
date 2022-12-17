package 创造型模式.原型模式.案例;

public class good implements Cloneable{
    private String name;//三号学生的名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name+"获得三好学生的奖状");
    }
    public good clone() throws CloneNotSupportedException{
        return (good) super.clone();
        //父类的类型是object，我们需要的是good类型，因此需要进行强制类型转换
    }
}
