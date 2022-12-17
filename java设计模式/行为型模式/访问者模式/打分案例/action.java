package 行为型模式.访问者模式.打分案例;

public abstract class action {
    abstract void getManResult(man man);//得到男性的结果
    abstract void getWomanResult(women women);//得到女性的结果
}
