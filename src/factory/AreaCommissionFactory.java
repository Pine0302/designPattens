package factory;

public  class AreaCommissionFactory implements CommissionFactory {
    @Override
    public Commission getCommissionInstance(){
        return new AreaCommission();
    }
}
