package 行为型模式.责任链模式.请假案例;
//老板，最高权限
public class bigBoss extends Hander{
    public bigBoss() {
        super(0);
    }

    @Override
    protected void handLeave(leaveRequest leave) {
        System.out.println("老板拥有最高权限，同意了");
    }
}
