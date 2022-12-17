package 结构型模式.组合模式.菜单案例;
//菜单组件：属于抽象根节点
public abstract class menuComponent {
    //共有的属性
    protected String name;
    protected int level;

    //添加子菜单
    //菜单能添加，菜单项不能添加，所以父类的方法默认是抛出一个不能添加的异常
    //下面一些添加、移除、get方法也是类似
    public void add(menuComponent component){
        throw new UnsupportedOperationException("不支持操作");
    }
    //移除子菜单
    public  void remove(menuComponent component){
        throw  new UnsupportedOperationException("不支持操作");
    }
    //获取指定的子菜单
    public menuComponent getchild(int level){
        throw new UnsupportedOperationException("不支持操作");
    }
    //获取名称
    public String getName(){
        return this.name;
    }
    //打印方法
    public abstract void print();
}
