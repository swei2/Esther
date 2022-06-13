import java.util.*;
import java.text.DecimalFormat;
public class PA6_2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
   
      System.out.print("The amount invested: ");
    int investmentAmount = keyboard.nextInt();   
      System.out.print("Annual interest rate: ");
    double IR = keyboard.nextDouble();
      double monthlyIR = IR/1200;
      
      System.out.println("Years" +"   \t" + "Future value");
      int years=0;
      
      DecimalFormat df = new DecimalFormat("#.00");
      
      while(years<30)
      {
        
        years++;
        System.out.println(years + "\t      " + df.format(futureValue(investmentAmount,monthlyIR,years)));
      
      }
  }

  public static double futureValue(double investmentAmount, double monthlyIR, int years)
  {
    double futureValue = 0.0;
    
    futureValue = investmentAmount * Math.pow(1+monthlyIR, years * 12);
    
    return futureValue;
    
  }

}