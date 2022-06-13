import java.util.*;

public class PA1_1
{
  public static void main(String[] args)
  {
  //input part of Celsius 
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter Fahrenheit temperature: ");
   
   double F = keyboard.nextDouble();
 
  //convert Fahrenheit to Celsius
  
  double C = 5.0/9.0*(F-32);
  
  //output part
  System.out.println(F + "Degrees Fahrenheit is "+ C +" degrees centigrade.");

  
  }
}