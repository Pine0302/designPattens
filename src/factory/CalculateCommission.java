package factory;


/**
 * 佣金计算类
 */
public class CalculateCommission {
    private Order order;
    private CommissionFactory commissionFactory;
    CalculateCommission(Order order,CommissionFactory commissionFactory){
        this.order = order;
        this.commissionFactory = commissionFactory;
    }

    public double getCommission(){
        AreaCommission areaCommission = new AreaCommission();
        System.out.println(areaCommission.getPercentage());
        return this.commissionFactory.getCommissionInstance().getPercentage() * this.order.getPrice();
    }

}
