package 行为型模式.访问者模式.打分案例;

public class man extends person{
    String name;

    public man(String name) {
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
        action.getManResult(this);
    }
}
