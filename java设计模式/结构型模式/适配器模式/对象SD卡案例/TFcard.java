package 结构型模式.适配器模式.对象SD卡案例;
//理解成不能与电脑直接连接的卡，要通过适配者才能够连接
public interface TFcard {
    void writeTF(String msg);
    String ReadTF();
}
