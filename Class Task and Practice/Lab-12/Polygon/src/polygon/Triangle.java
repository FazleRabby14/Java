
package polygon;


public class Triangle extends Polygon {
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC, int numSide) {
        super(numSide);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double area()
    {
        double result=(sideA*sideB)/2.0;
        return result;
    }
    
    public double perimeter()
    {
     
        double result=(sideA+sideB+sideC);
        return result;
    }
    
}
