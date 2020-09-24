package observer;

public class main {
    public static void main(String[] args) {
        Customer upperCustomerJack = new Customer("jack-123", 2);
        Customer buyerPine = new Customer("pine-123", 1, upperCustomerJack);
        Merchant merchant = new Merchant("merch-123", "小张烤鱼");
        Order newOrder = new Order("order-123", OrderState.INIT, buyerPine,merchant);


         //绑定变更事件
        newOrder.attach(new Message(buyerPine, "order paid"));
        newOrder.attach(new Message(upperCustomerJack, "your friend had just order something and you will get bonus"));
        newOrder.attach(new Message(merchant, "your client had just order something"));
        newOrder.attach(buyerPine);
        newOrder.attach(upperCustomerJack);

        newOrder.setOrderPaid();   //订单支付成功
        //newOrder.notifyChanged();

        System.out.println("buyer_new_level:" + buyerPine.getLevel());
        System.out.println("uppper_new_level:" + upperCustomerJack.getLevel());
    }

}
