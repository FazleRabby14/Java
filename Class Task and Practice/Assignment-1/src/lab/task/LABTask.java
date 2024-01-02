
package lab.task;
import java.util.Scanner;
public class LABTask {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any 5 digits number:");// I have taken input 12346.
        int digit=input.nextInt();
        
        int lastdigit=digit%10;
        int fastdigit=digit/10000;
        int sum=lastdigit+fastdigit;
        int count=0;
        
        System.out.println("Summation is:"+sum);// I got 7 in sumation.
        
        for(int i=1;i<=sum;i++){
            if(sum%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is prime number");// It is prime number.
        }
        else{
            System.out.println("It is not a prime number");
        }
        
    }
    
}
