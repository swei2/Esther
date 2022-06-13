import java.util.*;

public class Exercise2
{
  public static void main(String[] args)
  {
  //input part of Fahrenheit 
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Pls enter a c temperature: ");
   
   double c = keyboard.nextDouble();
 
  //convert Celsius to Fahrenheit 
  
  double f = 9.0/5.0*c +32;
  
  //output part
  System.out.println(c + "C equals to " + f + "F");

  
  }
}