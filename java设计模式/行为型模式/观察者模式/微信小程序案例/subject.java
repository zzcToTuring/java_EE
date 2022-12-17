package 行为型模式.观察者模式.微信小程序案例;
//抽象主题角色类
public interface subject {
    //添加观察者对象,传入的对象是抽象观察者
    void attcach(observer observer);

    //删除订阅者
    void delete(observer observer);

    //通知订阅者更新
    void notify(String msg);
}
