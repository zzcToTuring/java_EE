package 结构型模式.适配器模式.SD卡;
//电脑只能传递sd卡，创建一个适配器，他继承于TF卡，实现了SD卡标准的接口，因此能被电脑所接受
//在适配器中定义各种方式，完成数据的传递
public class test {
    public static void main(String[] args) {
        computer computer=new computer();
        String msg=computer.readSD(new SDcardA());
        System.out.println(msg);
        computer.writeSD(new SDcardA(),"test");

        //使用计算机读取TF卡中的数据
        System.out.println("================");
        SDadapterTF sDadapterTF=new SDadapterTF();//创建一个适配器
        String m=computer.readSD(sDadapterTF);
        System.out.println(m);
        computer.writeSD(sDadapterTF,"tttt");

    }
}
