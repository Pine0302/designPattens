package factory;



public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("pine",1);
        Order order = new Order("order-123", 200,OrderState.DONE, customer);
        CommissionFactory commissionFactory = new AreaCommissionFactory();
        CalculateCommission calculateCommission = new CalculateCommission(order,commissionFactory);
        System.out.println(calculateCommission.getCommission());
    }






}
