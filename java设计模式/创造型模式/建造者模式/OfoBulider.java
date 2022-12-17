package 创造型模式.建造者模式;
//ofo单车的具体操作
public class OfoBulider extends builder{
    @Override
    public void buildFrame() {
       bike.setFrame("ofo建造者的车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo建造者的车座");
    }

    @Override
    public bike creatBike() {
        return this.bike;
    }
}
