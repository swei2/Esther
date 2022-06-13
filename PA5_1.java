import java.util.*;

public class PA5_1
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please enter the number of triangle: ");
   int n = keyboard.nextInt();
    
     for(int i=1; i<=n; i++)
     {
        for (int j=1; j<=2*i-1; j++)
       {
        System.out.print("*");
       }
        System.out.println();
     }

  
   
   
   
   
  }
}
   
   
 