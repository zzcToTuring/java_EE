package 集合.set;

public class a2HashSet {
    public static void main(String[] args) {
        /**
         * 哈希值：
         *  1、根据hashcode方法计算出来的int类型的整数
         *  2、该方法定义在object类中，所有对象都可以调用，默认使用地址值进行计算
         *  3、一般情况下，会重写hashcode方法，利用对象内部的属性值计算哈希值
         *
         *
         *  对象哈希值的特点：
         *   1、如果没有重写hashcode方法，不同对象计算的哈希值是不同的(默认使用地址值进行计算)
         *   2、如果应届重写hashcode方法，不同的对象只要属性值相同，那么计算出的哈希值就是一样的
         *   3、在小部分的情况下，不同的属性值或者不同的地址值计算出来的哈希值也可能相同(哈希碰撞)
         *
         *   哈希表的组成：
         *   在jdk8之前：数组+链表
         *   从jdk8开始：数组+链表+红黑树
         *
         *   hashSet底层原理；
         *   1、hashSet集合底层采取哈希表存储数据，是一种对于增删改查数据性能都比较好的结构
         *   2、jdk8以后，当链表长度超过8并且数组长度大于等于64时，自动转化为红黑树
         *   ---------------------------------------
         *   hashSet存储过程：
         *      1、创建一个默认长度为16，默认加载因为0.75的数组，数组名table
         *      2、根据元素的哈希值跟数组的长度计算出应存入的位置
         *      3、判断当前位置是否为null，如果是null直接存入
         *      4、如果位置不为null，表示有元素，则调用equals方法比较属性值
         *      5、如果一样的话不存，如果不一样的话，则存入数组，形成链表
         *      (
         *      jdk8以前：新元素存入数组，老元素挂在新元素下面
         *      jdk8及以后：新元素直接挂在老元素下面
         *      )
         *
         */
    }
}
