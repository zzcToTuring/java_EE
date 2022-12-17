package 结构型模式.享受模式.俄罗斯方块;

import java.util.HashMap;

//工厂类，将该类设计为单例
public class boxfactory {
    //创建hash表

    private HashMap<String,abstractBox> map;
    //创建构造方法
    private boxfactory(){
        map=new HashMap<String,abstractBox>();
        map.put("I",new Ibox());
        map.put("L",new Lbox());
        map.put("O",new Obox());
    }
    //创建工厂对象
    //单例模式-饿汉式
    private static boxfactory boxfactory=new boxfactory();
    public static boxfactory getInstance(){
        return boxfactory;
    }
    //根据名称获取对象
    public abstractBox getshape(String name){
        return map.get(name);
    }
}
