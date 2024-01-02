/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
        System.out.print("Enter any 5 digits number:");// I have taken input 12346.
        int digit=input.nextInt();
       
        int lastdigit=digit%10;
        int fastdigit=digit/10000;
        int sum=lastdigit+fastdigit;
        int count=0;
       
        System.out.println("Summation is:"+sum);// I got 7 in summation.
       
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

