import java.util.*;

public class PA5_1Extra
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Please enter the number of diamond: ");
   int n = keyboard.nextInt();
    
     for(int i=1; i<=n; i++)
     {
        for (int j=1; j<=n-i; j++)
       {
        System.out.print(" ");
       }
          for (int k=1; k<=2*i-1; k++)
          {
            System.out.print("*");
          }
       
        System.out.println();
     }
   for(int i=1;i<=n-1;i++)
   {
     for(int j=1;j<=i;j++)
     {
     System.out.print(" ");
     }
      for(int k=1; k<=2*(n-1-i)+1; k++)
      {
      System.out.print("*");
      }
      System.out.println();
   
   }

  
   
   
   
   
  }
}
   
   
 