package 行为型模式.责任链模式.请假案例;
//总经理类
public class Boss extends Hander {
    public Boss() {
        super(Hander.NUM_SEVEN);
    }

    @Override
    protected void handLeave(leaveRequest leave) {
        if (leave.getNum() <= Hander.NUM_SEVEN) {
            System.out.println(leave.getName() + "请假" + leave.getNum() + "天，请假理由为：" + leave.getContent());
            System.out.println("总经理审批，同意");
        } else {
            System.out.println("总经理权限不够，交给老板审批");
        }
    }
}
