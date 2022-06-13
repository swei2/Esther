import java.util.*;

public class PA2_1
{
  public static void main(String[] args)
  {
  //input part of bursting pressure 
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter the rated bursting pressure of the boiler (psi): ");
   int burst_psi = keyboard.nextInt();
   
   System.out.print("Enter the current pressure (psi): ");
   double current_psi = keyboard.nextDouble();
        
   double max_safe_psi = (double)burst_psi / 3;
    System.out.println("The maximum safe pressure is "+max_safe_psi+ "psi");

  //calculate the burst_psi
  if (current_psi < max_safe_psi)
      {
      System.out.println("The current pressure is safe.");
      }
 else
     {
     System.out.println("WARNING! The current pressure is not safe.");
     }

  }
}