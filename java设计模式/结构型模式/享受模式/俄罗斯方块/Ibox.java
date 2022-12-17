package 结构型模式.享受模式.俄罗斯方块;
//具体享元角色，I图形类

public class Ibox extends abstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
