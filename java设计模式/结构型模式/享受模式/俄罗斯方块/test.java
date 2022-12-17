package 结构型模式.享受模式.俄罗斯方块;

public class test {
    public static void main(String[] args) {
        //享元模式，对同一个对象赋予不同的分配
        abstractBox box1=boxfactory.getInstance().getshape("L");
        box1.display("yellow");
        abstractBox box2=boxfactory.getInstance().getshape("O");
        box2.display("green");
        abstractBox box3=boxfactory.getInstance().getshape("I");
        box3.display("black");
        abstractBox box4=boxfactory.getInstance().getshape("I");
        box4.display("pink");
        System.out.println("box4与box3是否相等："+(box3==box4));
        System.out.println();

    }
}
