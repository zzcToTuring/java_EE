package 行为型模式.迭代器模式;
//抽象迭代器角色接口
public interface studentIterator {
    boolean hasnext();//是否还有next对象
    student getnext();//获取下一个元素
}
