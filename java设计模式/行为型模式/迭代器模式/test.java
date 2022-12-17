package 行为型模式.迭代器模式;

public class test {
    public static void main(String[] args) {
        //创建集合对象
        studentcontrolImpl control=new studentcontrolImpl();
        //添加元素
        control.addStudent(new student("张三","0001"));
        control.addStudent(new student("李四","0002"));
        control.addStudent(new student("王五","0003"));
        control.addStudent(new student("赵六","0004"));
        //遍历聚合对象
        //获取迭代器对象
        studentIterator iterator=control.getstudentIterator();
        while (iterator.hasnext()){
            student student=iterator.getnext();
            System.out.println(student.toString());
        }
    }
}
/*
理解：
学生对象是需要遍历的对象，抽象学生迭代类其中定义了学生迭代器中所需要定义的方法，具体迭代器中定了实现
学生抽象管理类中定义了学生类中需要满足的方法，有添加学生、删除学生、获取迭代器对象
返回的值是学生具体迭代器

 */
