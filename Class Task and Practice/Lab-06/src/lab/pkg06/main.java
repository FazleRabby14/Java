
package lab.pkg06;


public class main {
    public static void main(String [] args)
    {
        Fraction fb1=new Fraction(1,3);
        Fraction fb2=new Fraction(2,3);
        
        System.out.print("The addition of two fraction number will: ");
        fb1.add(fb2);
        System.out.println();
        
        System.out.print("The subtraction of two fraction number will: ");
        fb1.sub(fb2);
        System.out.println();
        
        System.out.print("The multiplication of two fraction number will: ");
        fb1.mul(fb2);
        System.out.println();
        
        System.out.print("The division of two fraction number will: ");
        fb1.div(fb2);
        System.out.println();
    }
}
