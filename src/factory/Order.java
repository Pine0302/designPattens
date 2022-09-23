package factory;

/**
 * 订单类
 */
public class Order {

    //订单状态
    private OrderState state;
    //订单号
    private String orderno;
    //购买客户
    private Customer customer;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;


    Order(String orderno,double price, OrderState initState, Customer customer) {
        this.orderno = orderno;
        this.price = price;
        this.state = initState;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "state=" + state +
                ", orderno='" + orderno + '\'' +
                ", customer=" + customer +
                '}';
    }

    public String getOrderno(){
        return this.orderno;
    }

    public void setOrderState(OrderState state) {
        this.state = state;
    }



}
