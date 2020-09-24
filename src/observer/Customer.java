package observer;

public class Customer extends Member implements Observer  {
    private int level;

    private Customer upperCustomer;
    
    Customer(String openid, int level) {
        super.setOpenid(openid);
        this.level = level;
    }

    Customer(String openid, int level, Customer upperCustomer) {
        this(openid, level);
        this.upperCustomer = upperCustomer;
    }



    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Customer getUpperCustomer() {
        return this.upperCustomer;
    }

    public void setUpperCustomer(Customer upperCustomer) {
        this.upperCustomer = upperCustomer;
    }

    public void upgradeLevel(Event event) {
        if (checkLevelUpgradeValid()) {
            this.level = this.level + 1;
        }
    }

    //检测是否可以升级
    private boolean checkLevelUpgradeValid() {
        return true;
    }


    @Override
    public void update(Event event) {
        this.upgradeLevel(event);
    }
}
