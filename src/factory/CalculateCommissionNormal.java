package factory;


/**
 * 佣金计算类
 */
public class CalculateCommissionNormal {
    private Order order;
    private Commission commission;


    CalculateCommissionNormal(Order order, Commission commission){
        this.order = order;
        this.commission = commission;
    }

    public double getCommission(){
        return this.commission.getPercentage() * this.order.getPrice();
    }

}
