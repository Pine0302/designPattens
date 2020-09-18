package observer;

public class Merchant {

    private String merchOpenidId;

    private String merchName;

    Merchant(String merchName, String merchOpenidId) {
        this.merchName = merchName;
        this.merchOpenidId = merchOpenidId;
    }

    public String getMerchOpenid() {
        return this.merchOpenidId;
    }

    public void setMerchOpenid(String merchOpenidId) {
        this.merchOpenidId = merchOpenidId;
    }


}
