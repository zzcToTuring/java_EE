package 行为型模式.迭代器模式;
//学生容器 抽象聚合角色接口
public interface studentcontrol {
    void addStudent(student student);
    void removeStudent(student student);//添加和删除功能
    //获取迭代器对象功能
    studentIterator getstudentIterator();


}
