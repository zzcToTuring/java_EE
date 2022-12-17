package 创造型模式.原型模式.基本克隆过程;

import 创造型模式.原型模式.基本克隆过程.realizeType;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象，作为原型要克隆的
        realizeType realizeType=new realizeType();
        realizeType clone=realizeType.clone();
        System.out.println(realizeType==clone);
        //两者不是同一个对象，因此克隆成功
    }
}
