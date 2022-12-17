package 创造型模式.原型模式.基本克隆过程;
//接口由JDK定义不用另外定义
public class realizeType implements Cloneable{
    public realizeType() {
        System.out.println("具体的对象创建成功");
    }
    public realizeType clone() throws CloneNotSupportedException{
        System.out.println("具体原型复制成功");
        return (realizeType) super.clone();
        //返回克隆对象，使用强制类型转换
    }

}
