package 行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

//具体实现 抽象聚合角色接口的实现
public class studentcontrolImpl implements studentcontrol {
    private List<student> list=new ArrayList<student>();
    @Override
    public void addStudent(student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(student student) {
        list.remove(student);
    }
    //获取迭代器对象
    @Override
    public studentIterator getstudentIterator() {
        return new studentIteratorImpl(list);
    }
}
