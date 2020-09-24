package observer;

public class Merchant extends Member implements Observer {

    private String merchName;

    Merchant(String merchName, String merchOpenidId) {
        super.setOpenid(merchOpenidId);
        this.merchName = merchName;
      
    }

  @Override
    public void update(Event event) {}


}
