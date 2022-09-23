package factory;


/**
 * 用户类
 */
public class Customer  {
    //用户等级
    private int level;

    //用户的专属id
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
