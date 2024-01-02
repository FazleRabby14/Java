
package polygon;


public class main {
    public static void main(String [] args){
    
    Polygon p=new Polygon(4);
    
    System.out.println("The area of a polygon:"+p.area());
    System.out.println("The perimeter of a polygon:"+p.perimeter());
    
    Polygon p1=new Triangle(3,4,5,6);
    
    System.out.println("The area of a Triangle:"+p1.area());
    System.out.println("The perimeter of a Triangle:"+p1.perimeter());
    
    }
}
