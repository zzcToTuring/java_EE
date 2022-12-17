package 结构型模式.享受模式.俄罗斯方块;
//抽象享元角色
public abstract class abstractBox {
    //获取方块的形状
    public abstract String getShape();
    //显示图形及颜色
    public void display(String color){
        System.out.println("方块形状："+getShape()+"，颜色"+color);
    }
}
