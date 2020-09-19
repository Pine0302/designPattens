package observer;

public class Message implements Observer {

    private String content;
    private Customer customer;

    Message(Customer customer, String content) {
        this.customer = customer;
        this.content = content;
    }

    /**
     * 给用户发送信息
     *
     * @param event
     */
    public void sendMessage(Event event) {
        System.out.println("send message ：'" + this.content + "' to customer： " + this.customer.getOpenid() + " orderno: " + event.getMap().get("orderno") + " order state : " + event.getMap().get("state"));
    }

    @Override
    public void update(Event event) {
        this.sendMessage(event);
    }
}
