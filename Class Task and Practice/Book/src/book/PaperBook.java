
package book;


public class PaperBook extends Book {
    private double weight;
    private double stock;

    public PaperBook( int isbin, String title, String author, double price, double weight, double stock) {
        super(isbin, title, author, price);
        this.weight = weight;
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "PaperBook{" + "weight=" + weight + ", stock=" + stock + "toString()=" +super.toString()+'}';
    }
    

    
  
    }
    
    
    

