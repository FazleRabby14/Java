
package lab.pkg11;


public class ThresholdDiscount implements DiscountedPrice{
    private double threshold;
    private double discount;

    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
     public double DiscountedPrice(double price) {
        return (price*price/100)+0.5;
    }
}
