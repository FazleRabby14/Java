package assigenment2;
import java.util.Scanner;

public class Accounting {
    private static double balance=0;
    
    public static void deposit(double amount){
        balance+=amount;
        System.out.print("Deposited money" +balance);
        System.out.println();
    }
     public static void withdraw(double amount){
        if(balance<amount){
        System.out.print("Insufficient money");
        System.out.println();
    }
        else{
            balance-=amount;
            System.out.println("Current Balance:"+balance);
            System.out.println();
        }
            
        }
     public static void printBalance(){
         System.out.print("Your current Balance is:" +balance);
     }


public static void main(String [] args){

    Scanner input=new Scanner(System.in);
    double amount;
    
    while(true){
        System.out.println("Please select an aoption:");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Balance");
        System.out.println("4.Exit");
        
        System.out.print("Enter your choice:");
        int choice=input.nextInt();
        System.out.println();
        
        if(choice==1){
            System.out.print("Enter amount to Deposit:");
            amount=input.nextDouble();
            System.out.println();
            deposit(amount);
        }
        else if(choice==2){
            System.out.print("Enter amount to Withdraw:");
            amount=input.nextDouble();
            System.out.println();
            withdraw(amount);
        }
          else if(choice==3){
            
            printBalance();
            System.out.println();
        }
        else if(choice==4){
            System.out.print("Exit Program.");
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