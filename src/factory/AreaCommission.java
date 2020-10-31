package factory;


/**
 * 区域奖励类
 */
public class AreaCommission extends Commission {

    public double percentage = 0.1;

    @Override
    public double getPercentage() {
        return percentage;
    }

    @Override
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
