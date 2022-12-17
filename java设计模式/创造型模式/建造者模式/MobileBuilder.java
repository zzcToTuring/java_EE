package 创造型模式.建造者模式;
//具体的构建者，用来构建单车
public class MobileBuilder extends builder{
    @Override
    public void buildFrame() {
        bike.setFrame("炭纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车架");
    }

    @Override
    public bike creatBike() {
        return this.bike;
    }
}
