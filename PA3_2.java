import java.util.*;

public class PA3_2
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("Celsius         Fahrenheit");
   System.out.println("___________________________");
   int count=0;
   
      while (count <= 20)
   {
      double f = 1.8*count+32;
      System.out.println(count +"                " + f);
      count=count+1;

   }
   

  }
  
}