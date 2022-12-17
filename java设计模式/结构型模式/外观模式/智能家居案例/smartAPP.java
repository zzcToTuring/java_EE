package 结构型模式.外观模式.智能家居案例;
//外观类 主要和对象进行聚合交互
public class smartAPP {
    private light light;
    private TV tv;
    private air air;
    //当创建smart对象时候，这些变量也自动生成了
    public smartAPP() {
        this.light = new light();
        this.tv = new TV();
        this.air = new air();
    }
    private void on(){
        air.on();
        tv.on();
        light.on();
    }
    private void off(){
        air.off();
        tv.off();
        light.off();
    }
    //通过语音控制
    public void say(String msg){
        if (msg.contains("打开")){
            this.on();
        }
        else if (msg.contains("关闭")){
            this.off();
        }
        else {
            System.out.println("我现在还听不懂你在说什么");
        }
    }

}
