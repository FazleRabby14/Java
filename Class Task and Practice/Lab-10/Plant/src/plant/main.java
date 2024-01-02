package plant;
import java.util.Scanner;
public class main {
    public static void add (Plant[] plants, Plant p ){
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]==null){
                plants[i]=p;
                break;
            }
        }
    }
    
    public static void remove(Plant[] plants, String n){
        for(int i=0;i<plants.length;i++){
            if(plants[i]!=null && plants[i].getName().equals(n)){
                plants[i]=null;
                break;
            }
        }
    }
    
    public static Plant search(Plant[] plants, String n){
        for(int i=0;i<plants.length;i++){
            if(plants[i]!=null && plants[i].getName().equals(n)){
                return plants[i];
            }
        }
        return null;
    }
    
    public static void display(Plant [] plants)
    {
        for (Plant p : plants) {
            if (p != null) {
                System.out.println(p.toString());
            }
        }
    }
    
    public static void main(String [] args)
    {
        Plant [] plants=new Plant[5];
        Plant f1 = new Flower("Rose", "Red", true,  true);
        Plant h1 = new Herb("Lavender", "Purple",true, "Summer");
        Scanner input=new Scanner(System.in);
        
        while(true){
            System.out.println("1.ADD");
            System.out.println("2.Remove");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            
            System.out.print("Enter your choice:");
            
            int choice;
            choice=input.nextInt();
           
            
        
            if(choice==1){
            System.out.print("Enter plant name: ");
            String name = input.next();
            System.out.print("Enter plant species: ");
            String color = input.next();
            Plant newPlant = new Plant(name, color);
            add(plants, newPlant);
            
             }
            
            
            else if(choice==2){
             System.out.print("Enter plant name to remove: ");
              String removeName = input.next();
              remove(plants, removeName);
              
            }
            
            else if(choice==3){
              System.out.print("Enter plant name to search: ");
              String SearchName = input.next();
              Plant searchedPlant=search(plants,SearchName);
                if(searchedPlant!=null){
                    System.out.println("Item is found");
                }
                else{
                    System.out.println("Item is not found");
                }
              
            }
            
           else if(choice==4){
 
            display(plants);
            }
           
           else if(choice==5){
                System.out.print("Exit Program");
                System.out.println();
                break;
            }
            
            else{
            System.out.print("You have chosen invalid option!");
            System.out.println();
        }
        
        
    }
    
    }
}
