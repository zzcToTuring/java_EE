package 行为型模式.中介者模式.租房案例;
//房东类 具体同事类
public class HouseOwn extends person {
    public HouseOwn(String name, mediator mediator) {
        super(name, mediator);
    }
    //和中介者联系
    public void constact(String message){
        mediator.content(message,this);
    }
    public void getMes(String message,person person){
        System.out.println("房东："+this.name+ "获取到"+person.name +"发出的信息，内容是 ："+message);
    }

}
