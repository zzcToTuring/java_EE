package 创造型模式.建造者模式;

public class test {
    public static void main(String[] args) {
        //创建创造者
        builder builder1=new OfoBulider();
        //创建指挥者
        Director director=new Director(builder1);
        bike bike=director.constrct();
        System.out.println(bike.getSeat());
    }
}
