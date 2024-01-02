
package person;

public class main {
    public static void main(String [] args)
    {
        PartTimeEmployee p1=new PartTimeEmployee(150,10,"CSE","Assistant","Rashid",22,"Badda");
        System.out.println(p1.toString());
        System.out.println(p1.salary());
        
        FullTimeEmployee p2=new FullTimeEmployee(1500,0.25,"IT","Manager","Raihan",25,"Gulshan");
        System.out.println(p2.toString());
        System.out.println(p2.salary());
    }
}
