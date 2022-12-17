package 行为型模式.中介者模式.租房案例;
//具体中介者
public class TrueMediator extends mediator {
    //聚合变量
    private tenant tenant;
    private HouseOwn houseOwn;



    public tenant getTenant() {
        return tenant;
    }

    public void setTenant(tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwn getHouseOwn() {
        return houseOwn;
    }

    public void setHouseOwn(HouseOwn houseOwn) {
        this.houseOwn = houseOwn;
    }

    @Override
    public void content(String msg, person person) {
        if (person == houseOwn){
            System.out.println(person.name+"：发送消息，"+msg);
            tenant.getMes(msg,person);//这个人是房主，那么租客收到消息
        }
        else {
            System.out.println(person.name+"：发送消息，"+msg);
            houseOwn.getMes(msg,person);
        }

    }
}
