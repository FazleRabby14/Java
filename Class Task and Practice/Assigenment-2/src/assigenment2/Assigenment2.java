
package assigenment2;
import java.util.Scanner;

public class Assigenment2 {

   public static boolean isPalindrome(String arg){
    int left=0;
    int right=arg.length()-1;
   
    while(left<right){
        if(arg.charAt(left)!=arg.charAt(right)){
            return false;
   }
     left++;
     right--;
  }
     return true;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an string:");
        String s=input.next();
        
        boolean t=isPalindrome(s);
        
        System.out.println(t);
    }
    
}
