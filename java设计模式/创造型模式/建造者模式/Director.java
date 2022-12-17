package 创造型模式.建造者模式;

//指挥者
public class Director {
    private builder builder;//声明builder类型的变量
    public Director(builder builder){
    this.builder=builder;
    }
    public bike constrct(){
        builder.buildSeat();
        builder.buildFrame();
        return builder.creatBike();
    }//组装
}
