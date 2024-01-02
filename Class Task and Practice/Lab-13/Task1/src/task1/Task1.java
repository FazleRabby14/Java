package task1;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
       
        int count=0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        
     while(count<10){   
        try{
            System.out.println("Enter positive integer only");
            int num=input.nextInt();
            if(num<0){
                throw new Exception("Input positive Integer only");
            }
            sum+=num;
            count++;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
     System.out.println("Summation of 10 positive integer will:"+sum);
    }
    
}
