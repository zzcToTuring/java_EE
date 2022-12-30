package 集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class a2contains的原理 {
    public static void main(String[] args) {
        //contains底层是依赖equals方法进行判断是否存在的。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法。
        Student s1=new Student("zhangsan",20);
        Student s2=new Student("lisi",22);
        Student s3=new Student("wangwu",25);
        Collection<Student> c=new ArrayList<>();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan",20);
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用Object类中的equals方法进行判断，而Object类中equals方法，依赖地址值进行判断。
        //需求：如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了。
        // （如果不重写的的话，他使用object类中的equals来判断是否相等，然而object的equals只是判断两者的地址是否相等）
        System.out.println(c.contains(s4));

    }
}
class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }



    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}

