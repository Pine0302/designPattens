package factory;

/**
 * 店铺奖励类的工厂类
 */
public  class GlobalCommissionFactory implements CommissionFactory{
    @Override
    public Commission createCommissionInstance(){
        return new GlobalCommission();
    }
}
