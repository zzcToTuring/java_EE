package 行为型模式.责任链模式.请假案例;

public class test {
    public static void main(String[] args) {
        //创建请假条
        leaveRequest leave=new leaveRequest("张三",7,"世界那么大，我想去看看");
        //创建各级领导
        group group=new group();
        smallBoss smallBoss=new smallBoss();
        Boss boss=new Boss();
        bigBoss bigBoss=new bigBoss();

        //设置处理链
        group.setNextHande(smallBoss);
        smallBoss.setNextHande(boss);
        boss.setNextHande(bigBoss);
        //张三只需要把请假条给自己的小组长提交即可
        group.summit(leave);

    }
}
