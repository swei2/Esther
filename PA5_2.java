import java.util.*;

public class PA5_2
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a stopping number: ");
   int n = keyboard.nextInt();
    
     for(int i=1; i<=n; i++)
     {
      for (int j=1; j<=i;j++)
      {
      System.out.println(i+ " x "+j+" = "+j*i);
      }
     }

  
   
   
   
   
  }
}
   
   
 