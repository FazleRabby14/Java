package task2;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
      
        int array[]=new int[100];
        int a = (int) (Math.random() * 10000);
        Scanner input=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            array[i]=a;
        }
        
        System.out.println("Enter of an array Index:");
        int index=input.nextInt();
        
        try{
            int value=array[index];
            
            System.out.println("Array value:"+value+" Array index:"+index);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index. Array index should be 0 to 100"+e);
        }
    }
    
}
