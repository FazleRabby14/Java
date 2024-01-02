
package lab.pkg11.pkg1;

public class Bicycle implements car {
    int speed;
    int Gear;

    public Bicycle(int speed, int Gear) {
        this.speed = speed;
        this.Gear = Gear;
    }

    
    public void print()
    {
        System.out.println("Speed "+speed+ " and Gear "+Gear);
    }

    @Override
    public void ChangeGear(int a) {
        Gear=a;
        
    }

    @Override
    public void SpeedUp(int a) {
        speed+=a;
    }

    @Override
    public void Break(int a) {
        speed-=a;
    }
    public void name(String name)
    {
        System.out.println("car name:"+name);
    }

    @Override
    public void price(int price) {
        System.out.println("Car price:"+price);
    }
}
