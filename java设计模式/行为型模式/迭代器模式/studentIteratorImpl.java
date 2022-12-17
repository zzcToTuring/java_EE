package 行为型模式.迭代器模式;

import java.util.List;

//具体迭代器角色类
public class studentIteratorImpl implements  studentIterator {
    private List<student> list;
    private int position=0;//用来记录遍历到哪个元素了
    //判断是否有下一个元素
    @Override
    public boolean hasnext() {
        return position<list.size();
    }
    //获得下一个元素的方法
    @Override
    public student getnext() {
        student nowstudent=new student();
        nowstudent=list.get(position);
        position++;
        return nowstudent;//返回当前的学生对象
    }
    //提供构造方法
    public studentIteratorImpl(List<student> list) {
        this.list = list;
    }
}
