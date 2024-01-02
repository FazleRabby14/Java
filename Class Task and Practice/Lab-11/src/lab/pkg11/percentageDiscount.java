
package lab.pkg11;


public class percentageDiscount implements DiscountedPrice{
    private double percentage;

    public percentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    
    public void setPercentage(double percentage)
    {
        this.percentage=percentage;
    }
    public double getPercentage()
    {
        return percentage;
    }

    @Override
    public double DiscountedPrice(double price) {
        return price*price/100;
    }
}
