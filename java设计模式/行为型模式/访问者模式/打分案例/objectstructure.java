package 行为型模式.访问者模式.打分案例;

import java.util.ArrayList;
import java.util.List;
//可以理解成一个管理容器
public class objectstructure {

    List<person> personList=new ArrayList<person>();
    public void addperson(person person){
        personList.add(person);
    }
    public void removeperson(person person){
        personList.remove(person);
    }
    //显示测评情况
    public void display(action action){
        for (person person:personList) {
            person.accept(action);
        }
    }
}
