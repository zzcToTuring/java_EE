package 结构型模式.适配器模式.对象SD卡案例;

//电脑只能传递sd卡，创建一个适配器，他继承于TF卡，实现了SD卡标准的接口，因此能被电脑所接受
//在适配器中定义各种方式，完成数据的传递
public class test {
    public static void main(String[] args) {
        computer computer=new computer();
        String msg=computer.readSD(new SDcardA());
        System.out.println(msg);
        computer.writeSD(new SDcardA(),"test");
        //使用适配器去读取
        System.out.println("================");
        TFcardA tFcardA=new TFcardA();
        SDadapterTF sDadapterTF=new SDadapterTF(tFcardA);
        String msg2=computer.readSD(sDadapterTF);
        System.out.println(msg2);

        computer.writeSD(sDadapterTF,"hello");
}}
