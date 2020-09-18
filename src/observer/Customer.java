package observer;

public class Customer implements Observer {
    private int level;

    private String openid;

    private Customer upperCustomer;

    Customer(String openid, int level) {
        this.openid = openid;
        this.level = level;
    }

    Customer(String openid, int level, Customer upperCustomer) {
        this(openid, level);
        this.upperCustomer = upperCustomer;
    }

    public String getOpenid() {
        return this.openid;
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

    public void upgradeLevel() {
        if (checkLevelUpgradeValid()) {
            this.level = this.level + 1;
        }
    }

    //检测是否可以升级
    private boolean checkLevelUpgradeValid() {
        return true;
    }


    @Override
    public void update() {
        this.upgradeLevel();
    }
}
