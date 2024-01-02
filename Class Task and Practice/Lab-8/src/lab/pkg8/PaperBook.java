
package lab.pkg8;

public class PaperBook {
    private double shipingweight;
    private int inStock;

    public PaperBook(double shipingweight, int inStock) {
        this.shipingweight = shipingweight;
        this.inStock = inStock;
    }

    public double getShipingweight() {
        return shipingweight;
    }

    public void setShipingweight(double shipingweight) {
        this.shipingweight = shipingweight;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "PaperBook{" + "shipingweight=" + shipingweight + ", inStock=" + inStock + '}';
    }
    
    
    
}
