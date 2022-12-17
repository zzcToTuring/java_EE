package 结构型模式.适配器模式.对象SD卡案例;

public class SDcardA implements SDcard {
    @Override
    public String readSD() {
        String msg="SD卡读取数据ing";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写入数据:"+msg);
    }
}
