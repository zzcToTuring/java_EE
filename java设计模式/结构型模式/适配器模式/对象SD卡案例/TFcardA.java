package 结构型模式.适配器模式.对象SD卡案例;

//适配者类
public class TFcardA implements TFcard {
    @Override
    public void writeTF(String msg) {
        System.out.println("TF卡写入数据: "+msg);
    }

    @Override
    public String ReadTF() {
        String msg="TF卡读数据ing";
        return msg;
    }
}
