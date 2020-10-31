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
        Commission commission = commissionFactory.createCommissionInstance();
        return commission.getPercentage() * this.order.getPrice();
    }

}
