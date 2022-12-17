package 行为型模式.命令模式.order;

import java.util.HashMap;
import java.util.Map;

//订单类
public class order {
    private int diningTables;//哪个桌的订单
    private Map<String, Integer> foodDir = new HashMap<String, Integer>();//订单 名称和份数

    public int getDiningTables() {
        return diningTables;
    }

    public void setDiningTables(int diningTables) {
        this.diningTables = diningTables;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int count){
        foodDir.put(name,count);//添加数量的方法
    }

}
