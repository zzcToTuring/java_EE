package IO流.E序列化流与反序列化流;

import java.io.Serial;
import java.io.Serializable;

//要实现这个接口 但什么都不用重写--->实现这个接口表示这个Javabean能使用序列化流
public class student implements Serializable {
    String name;
    int age;
    //transient关键字表示这个成员变量不会被序列化--->虽然有这个变量，但不会被序列化到；反序列化的时候也不会被读
    private transient String address;

    /**
     * private static final long serialVersionUID =XXXL
     * 表示这个javabean的版本号
     * 当对象封装到文本中时，如果Javabean改变了，那么使用反序列流的时候会报错--->因为版本号发生了改变
     * 如果这个时候使用final包装了版本号，所以版本号不会发生改变，因此即使Javabean发生变化了，也不会影响读取
     *
     * 如果有时候忘了怎么写，可以去看ArrayList源码
     */

    @Serial
    private static final long serialVersionUID = 123L;
    public student() {
    }

    public student(String name, int age,String address) {
        this.name = name;
        this.age = age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
