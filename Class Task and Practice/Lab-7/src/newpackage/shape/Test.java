
package newpackage.shape;

public class Test {
    public static void main(String [] args)
    {
        //Square s=new Square(4.0,5.5,"Red");
        Square s=new Square(12,14,"r");
        //double area=s.area();
        //double perimeter=s.perimeter();
        System.out.println("Information of Square object:"+s.toString());
        System.out.println("Area is:"+s.area());
        System.out.println("Perimeter is:"+s.perimeter());
        
    }
}
