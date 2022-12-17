import java.util.ArrayList;

public class demo03_ArrayList和LinkedList的区别 {
    public static void main(String[] args) {
        /**
         * 1、首先，他们的底层数据结构不同，ArrayList底层是基于数组实现的，LinkedList底层是基于链表实现的
         * 2、由于他们的底层数据结构不同，他们所使用的场景不同，ArrayList更适合随机查找，LinkedList更适合与添加、查询、删除的时间复杂度不同
         * 但是也有特殊的情况，由于队列的特性，用LinkedList查找第一个或者最后一个元素的时候，效率也是非常高的
         * ArrayList要是不扩充数组的话，添加也是非常快的，要是进行添加需要扩充数组，是速率比较慢的
         * 两者各有优点和缺点，根据自己的实际需求进行连接
         * 3、另外ArrayList和LinkedList都实现了list接口，但是LinkedList还能额外实现了DeQue接口，所以LinkedList可以当成队列使用
         */
        ArrayList s = new ArrayList();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(1, 999);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
    }

