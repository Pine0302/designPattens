package observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subjetc {

    private OrderState state;
    private String orderno;
    private Customer customer;
    private List<Observer> observerList = new ArrayList<>();

    Order(String orderno, OrderState initState, Customer customer) {
        this.orderno = orderno;
        this.state = initState;
        this.customer = customer;
    }

    public void setOrderState(OrderState state) {
        this.state = state;
    }

    public void setOrderPaid() {
        this.setOrderState(OrderState.PAID);
        this.observerList.forEach(o -> o.update());
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
    public void notifyChanged() {
       // this.observerList.forEach(o -> o.update());
        /*for (Observer observer : observerList) {
            observer.update();
        }*/
    }
}
