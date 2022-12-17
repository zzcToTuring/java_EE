package 行为型模式.访问者模式.打分案例;

public class women extends person{
    String name;

    public women(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void accept(action action) {
        action.getWomanResult(this);
    }
}
