package 行为型模式.观察者模式.微信小程序案例;

import java.util.ArrayList;
import java.util.List;

//具体主题类 微信推送
public class wechatupdate implements subject {
    //定义一个集合，用来存放多个观察者对象
    private List<observer> wechatUser=new ArrayList<observer>();


    @Override
    public void attcach(observer observer) {
        wechatUser.add(observer);
    }

    @Override
    public void delete(observer observer) {
        wechatUser.remove(observer);
    }

    @Override
    public void notify(String msg) {
        //遍历集合
        for (observer observer:wechatUser) {
            observer.update(msg);
        }
    }
}
