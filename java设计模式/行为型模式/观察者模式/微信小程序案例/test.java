package 行为型模式.观察者模式.微信小程序案例;

public class test {
    public static void main(String[] args) {
        //创建用户
        wechatUser wechatUser1=new wechatUser("张三");
        wechatUser wechatUser2=new wechatUser("李四");
        wechatUser wechatUser3=new wechatUser("王五");

        //创建公众号对象
        wechatupdate wechat=new wechatupdate();

        //把观察者添加进来
        wechat.attcach(wechatUser1);
        wechat.attcach(wechatUser2);
        wechat.attcach(wechatUser3);

        wechat.notify("公众号更新了");

    }
}
