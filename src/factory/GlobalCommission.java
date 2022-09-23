package factory;


/**
 * 全局奖励类
 */
public class GlobalCommission extends Commission{
    private double percentage = 0.2;

    @Override
    public double getPercentage() {
        return percentage;
    }

    @Override
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
