package 创造型模式.建造者模式;
//抽象构建者
public abstract class builder {
    //声明bike类型的变量，并进行赋值
    protected bike bike=new bike();
    public  abstract  void buildFrame();
    public  abstract  void buildSeat();
    public abstract bike creatBike();

}
