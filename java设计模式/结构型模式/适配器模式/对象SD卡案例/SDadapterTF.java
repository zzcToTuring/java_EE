package 结构型模式.适配器模式.对象SD卡案例;

//一个适配器类
public class SDadapterTF  implements SDcard
{
    private TFcard tFcard;

    public SDadapterTF(TFcard tFcard) {
        this.tFcard = tFcard;
    }

    @Override

    public String readSD() {
        System.out.println("使用适配器读取");
        return tFcard.ReadTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("使用适配器写入数据");
        tFcard.writeTF(msg);
    }
}
