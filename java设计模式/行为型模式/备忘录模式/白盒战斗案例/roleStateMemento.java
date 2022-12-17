package 行为型模式.备忘录模式.白盒战斗案例;
//备忘录角色类
public class roleStateMemento {
    private int vit;//生命力
    private int ack;//攻击力
    private int def;//防御力

    public roleStateMemento(int vit, int ack, int def) {
        this.vit = vit;
        this.ack = ack;
        this.def = def;
    }

    public roleStateMemento() {
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAck() {
        return ack;
    }

    public void setAck(int ack) {
        this.ack = ack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
