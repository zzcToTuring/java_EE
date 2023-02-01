package 反射.课程补充;

public class T2_基本数据类型获取class的方法 {
    public static void main(String[] args) {
        //基本数据(int char boolean float double byte long short)获取class对象
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;

        //基本数据类型对应的包装类，可以通过.TYPE得到class类对象
        Class<Integer> type = Integer.TYPE;
        Class<Character> type1 = Character.TYPE;
    }
}
