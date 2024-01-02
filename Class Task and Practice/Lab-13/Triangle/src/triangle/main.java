package triangle;

public class main {
    public static void main(String args[]){
        try{
        Triangle t=new Triangle(1.0,2.0,2.0);
    }
     catch(IllegalTriangleException e)  {
         System.out.println(e.getMessage());
     } 
}
}
