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
     */
    public void sendMessage() {
        System.out.println("send message ：'" + this.content + "' to customer： " + this.customer.getOpenid());
    }

    @Override
    public void update() {
        this.sendMessage();
    }
}
