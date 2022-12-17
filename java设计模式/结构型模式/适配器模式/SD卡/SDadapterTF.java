package 结构型模式.适配器模式.SD卡;
//一个适配器类
public class SDadapterTF  extends TFcardA implements SDcard
{
    @Override
    public String readSD() {
        System.out.println("使用适配器读取");
        return super.ReadTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器写入数据");
        super.writeTF(msg);
    }
}
