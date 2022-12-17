package 创造型模式.原型模式.案例三_深克隆;

public class student implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                '}';
    }
    public student clone() throws CloneNotSupportedException{
        return (student)super.clone();
    }
}
