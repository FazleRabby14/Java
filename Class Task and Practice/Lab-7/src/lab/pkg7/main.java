
package lab.pkg7;

public class main {
    public static void main(String [] args){
        Point p1=new Point(1,2);
        Point p2=new Point(4,5);
        double dis=p1.distance(p2);
        System.out.println("Distance is:"+dis);
        Line l=new Line(p1,p2);
        double dis1=l.length();
        System.out.println("Distance is:"+dis1);
        
    }
}
