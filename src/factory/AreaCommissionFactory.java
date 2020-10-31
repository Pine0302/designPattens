package factory;

public  class AreaCommissionFactory implements CommissionFactory {
    @Override
    public Commission createCommissionInstance(){
        return new AreaCommission();
    }
}
