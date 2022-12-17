package 行为型模式.迭代器模式;
//学生信息的迭代，学生类
public class student {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
