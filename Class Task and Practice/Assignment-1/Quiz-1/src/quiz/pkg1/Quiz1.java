
package quiz.pkg1;

import java.util.Scanner;
public class Quiz1 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int arr1[][]=new int [3][3];
        int sum=0;
        String s;
        System.out.println("Enter a 2D array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=input.nextInt();
            }
        }
        System.out.println("The output of this 2D array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                 System.out.print(arr1[i][j]+" ");
            }
             System.out.println();
        }
   
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i+j==2){
                    sum=sum+arr1[i][j];
                }
                if(sum>20){
         
        
         s=input.nextLine();
         
         for(int k=0;k<s.length();k++){
             System.out.println("After replacing all vowels into capital case = " +
                                      s.replaceAll("a", "A").replaceAll("e", "E")
                                      .replaceAll("i", "I").replaceAll("o", "O")
                                      .replaceAll("u", "U"));
             break;
        }
         break;
      
         }
            }
        }
    
     

        
     }
   
   
    }

    

