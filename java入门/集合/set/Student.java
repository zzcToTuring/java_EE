package 集合.set;

//如果不加泛型的话则默认是object
public class Student implements Comparable<Student> {
    String name;
    int age;

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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }


    @Override
    //this：表示当前要添加的元素
    //o：表示已经在红黑树中存入的元素
    public int compareTo(Student o) {
        //对年纪进行升序
        return this.getAge()-o.getAge();
    }

}
