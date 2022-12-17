package 结构型模式.组合模式.菜单案例;
//菜单项类 叶子结点
public class menuitem extends menuComponent {
    public menuitem(String name,int level) {
        this.name=name;
        this.level=level;
    }
    //叶子结点，里面没有其他的内容了
    //所以不用重写添加删除的方法
    @Override
    public void print() {
        //格式化输出
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        //打印菜单项的名称
        System.out.println(name);
    }
}
