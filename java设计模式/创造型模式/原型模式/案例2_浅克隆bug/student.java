package 创造型模式.原型模式.案例2_浅克隆bug;

public class student {
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
}
