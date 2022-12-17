package 行为型模式.观察者模式.微信小程序案例;
//抽象观察者对象
public interface observer {
    //更新，主题推送
    void update(String msg);
}
