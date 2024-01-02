
package point;

public class main {
    public static void main(String [] args)
    {
        Point p1=new Point(1,2);
        System.out.println(p1.toString());
        Point p2=new Point(3,4);
        double dis=p1.distance(p2);
        System.out.println(dis);
        Line l =new Line(p1,p2);
        double dis1=l.length();
        System.out.println(dis1);
    }
}
