package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Order implements Subject {

    private OrderState state;
    private String orderno;
    private Customer customer;
    private Merchant merchant;
    private List<Observer> observerList = new ArrayList<>();

    Order(String orderno, OrderState initState, Customer customer,Merchant merchant) {
        this.orderno = orderno;
        this.state = initState;
        this.customer = customer;
        this.merchant = merchant;
    }

    public String getOrderno(){
        return this.orderno;
    }

    public void setOrderState(OrderState state) {
        this.state = state;
    }

    public void setOrderPaid() {
        this.setOrderState(OrderState.PAID);
        Map map = new HashMap();
        map.put("orderno",this.orderno);
        map.put("state",this.state);
        this.notifyChanged(new Event(map));
        //发布事件
        //给用户发信息
       /* Message messageBuyer = new Message(this.customer,"order paid");
        Message messageUpper = new Message(this.customer.getUpperCustomer(),"your friend had just order something and you will get bonus");
        messageBuyer.sendMessage();
        messageUpper.sendMessage();
        this.customer.upgradeLevel();
        this.customer.getUpperCustomer().upgradeLevel();*/
    }


    @Override
    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyChanged(Event event) {
        this.observerList.forEach(o -> o.update(event));
        /*for (Observer observer : observerList) {
            observer.update();
        }*/
    }
}
