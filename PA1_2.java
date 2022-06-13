import java.util.*;

public class PA1_2
{
  public static void main(String[] args)
  {
  //input part of female and male students 
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter the number of female students: ");
   int f = keyboard.nextInt();
   
   System.out.println("Enter the number of male students: ");
   int m = keyboard.nextInt();
 
  //calculate the percentage of male and female
  
  double percentf = (double)f / (f + m) *100;
  double percentm = (double)m / (f + m) *100;
  
  //output part
  System.out.println("The female percenteage is: "+ percentf+ "%");
  System.out.println("The male percenteage is: "+ percentm+ "%");

  }
}