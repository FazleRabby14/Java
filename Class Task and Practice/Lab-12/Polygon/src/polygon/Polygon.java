package polygon;

public class Polygon {

    private int numSide;

    public Polygon(int numSide) {
        this.numSide = numSide;
    }

    public int getNumSide() {
        return numSide;
    }

    public void setNumSide(int numSide) {
        this.numSide = numSide;
    }

    @Override
    public String toString() {
        return "Polygon{" + "numSide=" + numSide + '}';
    }
    
    public double area()
    {
        double l=4;
        double r=5;
        double result=(numSide/2.0)*l*r;
        return result;
    }
    
    public double perimeter()
    {
       double numonside=3;
       double result=(numSide)*numonside;
       return result;
    }
   
    
}
