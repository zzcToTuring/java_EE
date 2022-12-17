package 行为型模式.观察者模式.微信小程序案例;
//具体观察者对象 微信的用户
public class wechatUser implements observer{
    private String name;

    public wechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(this.name+"接受到了推送："+msg);
    }
}
