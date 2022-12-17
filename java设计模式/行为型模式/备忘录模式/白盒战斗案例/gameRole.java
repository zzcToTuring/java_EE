package 行为型模式.备忘录模式.白盒战斗案例;
//游戏角色类
public class gameRole {
    private int vit;//生命力
    private int ack;//攻击力
    private int def;//防御力

    //初始状态
    public void initState(){
        this.ack=100;
        this.def=100;
        this.vit=100;
    }
    //战斗状态
    public void fight(){
        this.ack=this.def=this.vit=0;
    }
    //保存角色的状态功能
    public roleStateMemento saveState(){
        return new roleStateMemento(this.vit,this.ack,this.def);
    }
    //recoverState角色数据恢复
    public void recoverState(roleStateMemento roleStateMemento){
        this.ack=roleStateMemento.getAck();
        this.def=roleStateMemento.getDef();
        this.vit=roleStateMemento.getVit();
    }
    //恢复当前状态

    //展示角色的状态
    public void show(){
        System.out.println("角色状态：生命力："+this.vit);
        System.out.println("角色状态：攻击力："+this.ack);
        System.out.println("角色状态：防御力："+this.def);
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
