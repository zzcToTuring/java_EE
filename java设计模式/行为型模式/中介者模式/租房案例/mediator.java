package 行为型模式.中介者模式.租房案例;
//抽象中介者
public abstract class mediator {
    //抽象类 交流功能，输入内容和交流的对象
   public abstract void content(String msg,person person);

}
