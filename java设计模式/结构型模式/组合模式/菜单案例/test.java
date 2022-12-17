package 结构型模式.组合模式.菜单案例;

public class test {
    public static void main(String[] args) {
        //创建菜单树
        menuComponent menu1=new menu("菜单管理",2);
        menu1.add(new menuitem("页面访问",3));
        menu1.add(new menuitem("编辑菜单",3));
        menu1.add(new menuitem("删除菜单",3));
        menu1.add(new menuitem("新增菜单",3));
        menuComponent menu2=new menu("权限管理",2);
        menu2.add(new menuitem("增加权限",3));
        menu2.add(new menuitem("修改权限",3));
        menuComponent menu3=new menu("角色管理",2);
        menu3.add(new menuitem("增加角色",3));
        menu3.add(new menuitem("删除角色",3));
        menu3.add(new menuitem("修改角色",3));
        menu3.add(new menuitem("查询角色",3));

        //创建一级菜单
        menuComponent component=new menu("系统管理",1);
        //将创建好的二级菜单放入一级菜单中
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        //打印菜单名称
        component.print();
    }
}

