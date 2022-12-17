package 行为型模式.备忘录模式.黑盒战斗案例;
//管理者类 实现memento的管理
public class control {
    private memento memento;

    public memento getMemento() {
        return memento;
    }

    public void setMemento(memento memento) {
        this.memento = memento;
    }
}
