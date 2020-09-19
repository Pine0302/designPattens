package observer;

import java.util.Map;

//这里的event 用来保存需要传递的信息
//本例子仅中直接使用成员变量order
//可以使用java 泛型作为形参来制定生成任何需要传递的信息
public class Event {
    private Map map;
    Event(Map map){
        this.map = map;
    }
    public Map getMap(){
        return this.map;
    }
}
