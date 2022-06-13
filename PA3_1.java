import java.util.*;

public class PA3_1
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter a year: ");
   int year = keyboard.nextInt();
   
   if (year > 0)
   {
     if (year % 4 ==0)
       System.out.print(year + " is a leap year.");
     else if(year % 400 == 0)
        System.out.print(year + " is a leap year.");
     else if(year % 100 == 0)
        System.out.print(year + " is common year.");
     else
     {
       System.out.print(year + " is common year.");
     }
   }
   else
   {
        System.out.print(year + " is invalid year.");
   }
     

   
  }
  
}