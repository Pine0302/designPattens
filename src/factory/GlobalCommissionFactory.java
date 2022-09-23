package factory;

/**
 * 全局奖励类的工厂类
 */
public  class GlobalCommissionFactory implements CommissionFactory{
    @Override
    public Commission createCommissionInstance(){
        return new GlobalCommission();
    }
}
