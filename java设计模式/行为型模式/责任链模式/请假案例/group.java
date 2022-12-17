package 行为型模式.责任链模式.请假案例;
//定义组长类
public class group extends Hander {
    //定义构造方法，请假的天数只能是从0-1
    public group() {
        super(Hander.NUM_ONE);
    }
    //重写方法，每个责任链的对象（管理员）都有着不同的权限
    @Override
    protected void handLeave(leaveRequest leave) {
        if (leave.getNum()<=Hander.NUM_ONE){
            System.out.println(leave.getName()+"请假"+leave.getNum()+"天，请假理由为："+leave.getContent());
            System.out.println("小组长审批，同意");
        }
        else {
            System.out.println("小组长权限不够，交给副经理审批");
        }

    }
}
