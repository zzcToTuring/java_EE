package 行为型模式.责任链模式.请假案例;
//副经理类
public class smallBoss extends Hander{
    public smallBoss() {
        super(Hander.NUM_THREE);
    }

    @Override
    protected void handLeave(leaveRequest leave) {
        if (leave.getNum()<=Hander.NUM_THREE){
            System.out.println(leave.getName()+"请假"+leave.getNum()+"天，请假理由为："+leave.getContent());
            System.out.println("副经理审批，同意");
        }
       else {
            System.out.println("副经理权限不够，交给总经理审批");
        }
    }
}
