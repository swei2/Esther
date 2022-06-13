import java.util.*;

public class Exercise6
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please enter number of rows: ");
   int n = keyboard.nextInt();
   System.out.print("Please enter number of columns: ");
   int m = keyboard.nextInt();
   
     for(int i=0; i<n; i++)
     {

       for(int j=0; j<m; j++)
       {
        System.out.print("*");
       }
        System.out.println();  //loop body for the outer loop, will be executed 3 times    
     }
  

  }
}