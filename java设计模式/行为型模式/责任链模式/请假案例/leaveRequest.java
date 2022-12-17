package 行为型模式.责任链模式.请假案例;
//请假条类
public class leaveRequest {
    private String name;
    private int num;
    private String content;

    public leaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
