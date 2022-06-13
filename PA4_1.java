import java.util.*;

public class PA4_1
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);

   int n = 1, i;
  while(n!=0)
   {   
   System.out.print("Enter a year(0 to stop): ");
   int year = keyboard.nextInt();
   
   if (year > 0)
   {
     if (year % 4 ==0 && year % 100 != 0)
       System.out.println(year + " is a leap year.");
     else if(year % 400 == 0)
        System.out.println(year + " is a leap year.");
     else if(year % 100 == 0)
        System.out.println(year + " is common year.");
     else
     {
       System.out.println(year + " is common year.");
     }
   }
   else
   {
      //  System.out.println(year + " is invalid year.");
   }
   
   if (year == 0)
   {
        System.out.println("Bye.");   
        break;
   }  

  }
  }
}