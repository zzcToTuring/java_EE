import java.util.ArrayList;
import java.util.Arrays;

public class demo{
    public static void main(String[] args) throws Exception {
        Bank b=new Bank();
        sqlTool sql1=new sqlTool();
        String sql_update="update t_bank set money=? where id=?";
        String sql_select="select account,money from t_bank where id in (?,?)";
        //执行修改操作
        int update = sql1.update(sql_update, 1001, 1);
        System.out.println(update);

        ArrayList<? extends Bank> query = sql1.query(b.getClass(), sql_select, 1, 2);
        System.out.println(Arrays.toString(query.toArray()));

    }
}

class Bank{
    private int id;
    private String account;
    private long money;

    public Bank() {
        this.account="未获取";
        this.id=-1;
        this.money=-1;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}

class sqlTool extends baseDao{}
