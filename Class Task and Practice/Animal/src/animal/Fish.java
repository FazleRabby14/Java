
package animal;


public class Fish extends Animal{
    
    private String name;
    private double weight;
    private double price;

    public Fish(String name, double weight, double price, int age, String gender, boolean isMammal) {
        super(age, gender, isMammal);
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double totalPrice()
    {
        double result=this.price*1.5;
        return result;
    }
    @Override
    public String toString() {
        return "Fish{" + "name=" + name + ", weight=" + weight + ", price=" + price + '}';
    }
    

}
