package lab.pkg11.pkg1;

public class main {
    public static void main(String [] args)
    {
        Bicycle b=new Bicycle(4,2);
        b.print();
        b.ChangeGear(3);
        b.SpeedUp(10);
          b.print();
        Bicycle c=new Bicycle(5,6);
        c.name("mercedes");
        c.price(20000000);
    }
}
