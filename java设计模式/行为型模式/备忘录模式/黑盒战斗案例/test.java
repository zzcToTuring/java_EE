package 行为型模式.备忘录模式.黑盒战斗案例;



public class test {
    public static void main(String[] args) {

        System.out.println("====打boss前====");
        gameRole gameRole=new gameRole();
        gameRole.initState();//初始状态
        gameRole.show();

        System.out.println("===打过了第一关，存档===");
        gameRole.setVit(80);
        gameRole.setDef(80);
        gameRole.show();

        //记录一下这个状态，好进行备份
        control control=new control();//创建状态的管理者
        control.setMemento(gameRole.saveState());//管理者设置当前状态，gamerole里面就有保存当前状态的方法

        System.out.println("=====打boss后======");
        gameRole.fight();
        gameRole.show();

        System.out.println("====进行恢复存档操作====");
        gameRole.recoverState(control.getMemento());
        gameRole.show();

    }
}
