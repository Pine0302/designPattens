package factory;


public class main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //getCommissionByFactory();
        Customer customer = new Customer("pine", 1);
        Order order = new Order("order-123", 100, OrderState.DONE, customer);
        getCommissionByFactory(order);
        getCommissionNormal(order);
    }

    private static void getCommissionByFactory(Order order) {
        CommissionFactory areaCommissionFactory = new AreaCommissionFactory();
        CalculateCommission areaCalculateCommission = new CalculateCommission(order, areaCommissionFactory);
        System.out.println("factory-计算区域奖励：" + areaCalculateCommission.getCommission());

        CommissionFactory globalCommissionFactory = new GlobalCommissionFactory();
        CalculateCommission globalCalculateCommission = new CalculateCommission(order, globalCommissionFactory);
        System.out.println("factory-计算店铺奖励：" + globalCalculateCommission.getCommission());
    }

    private static void getCommissionNormal(Order order) {
        Commission areaCommission = new AreaCommission();
        CalculateCommissionNormal areaCalculateCommissionNormal = new CalculateCommissionNormal(order, areaCommission);
        System.out.println("normal-计算区域奖励：" + areaCalculateCommissionNormal.getCommission());

        Commission globalCommission = new GlobalCommission();
        CalculateCommissionNormal globalCalculateCommissionNormal = new CalculateCommissionNormal(order, globalCommission);
        System.out.println("normal-计算店铺奖励：" + globalCalculateCommissionNormal.getCommission());
    }


}
