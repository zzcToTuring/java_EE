package 反射.javabean;

import java.io.IOException;

public class student {
    private String name;
    private int age;

    public student(){}
    public student(String name){
        this.name=name;
    }
    protected student(int age){
        this.age=age;
    }
    private student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

     private  String  getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private void eat(String something) throws IOException {
        System.out.println("在吃"+something);
    }
    private void sleep(){
        System.out.println("睡觉");
    }

}