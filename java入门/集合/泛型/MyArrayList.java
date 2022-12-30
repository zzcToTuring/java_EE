package 集合.泛型;

import java.util.Arrays;

public class MyArrayList<E> {
    //自定义一个类 但是我不知道他的数据类型 这个时候就可以使用到泛型了
    Object[] obj=new Object[10];
    int size;
    //E： 表示是不确定的类型  e：形参的名字，变量名
    public boolean add(E e){
        obj[size]=e;
        size++;
        return true;
    }
    public E get(int index){
        return (E)obj[index];
    }
    @Override
    public String toString(){
        return Arrays.toString(obj);
    }
}
