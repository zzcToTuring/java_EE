package 行为型模式.中介者模式.租房案例;
//租房者，具体的同事角色类
public class tenant extends person {
    public tenant(String name, mediator mediator) {
        super(name, mediator);
    }
    //和中介沟通的方法
    public void constact(String message){
        mediator.content(message,this);
    }
    //获取信息的方法
    public void getMes(String message,person person){
        System.out.println("租房者："+this.name+ "获取到"+person.name +"发出的信息，内容是 ："+message);
    }

}
