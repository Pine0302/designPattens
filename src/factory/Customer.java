package factory;


/**
 * 用户类
 */
public class Customer  {
    private int level;
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    Customer(String openid, int level) {
        this.setOpenid(openid);
        this.level = level;
    }


}
