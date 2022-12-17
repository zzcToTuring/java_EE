package 结构型模式.组合模式.菜单案例;

import java.util.ArrayList;
import java.util.List;

//菜单类 属于树枝结点
public class menu extends menuComponent {
    //菜单可以有多个子菜单或者子菜单项，使用数组的方式
    private List<menuComponent> menuList=new ArrayList<menuComponent>();
    //提供构造方法
    public menu(String name,int level){
        this.name=name;
        this.level=level;
    }
    //添加操作，直接调用list集合里面的添加方法
    @Override
    public void add(menuComponent component) {
        menuList.add(component);
    }

    @Override
    public void remove(menuComponent component) {
        menuList.remove(component);
    }
    //获得子类菜单的方法
    @Override
    public menuComponent getchild(int level) {
       return menuList.get(level);
    }

    @Override
    public void print() {
        //格式化输出
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        //菜单名称
        System.out.println(name);
        //子菜单名称
        for (menuComponent component:menuList) {
            component.print();
        }
    }
}
