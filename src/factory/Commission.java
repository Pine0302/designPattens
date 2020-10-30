package factory;

/**
 * 奖励类接口
 */
public abstract class Commission {
    private double percentage;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

}
