package 行为型模式.访问者模式.打分案例;

public class success extends action{
    @Override
    void getManResult(man man) {
        System.out.println("男评委："+man.getName()+"通过");
    }

    @Override
    void getWomanResult(women women) {
        System.out.println("女评委："+women.getName()+"通过");
    }
}
