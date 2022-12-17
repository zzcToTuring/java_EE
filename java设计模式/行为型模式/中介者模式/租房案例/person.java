package 行为型模式.中介者模式.租房案例;
//抽象同事类
public abstract class person {
    protected String name;//名字
    protected mediator mediator;//所依赖的中介者

    public person(String name, mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
