import java.util.*;

public class Excercise5
{
  public static void main(String[] args)
  {
   int n=1,i;
   Scanner keyboard = new Scanner(System.in);  
  
  while(n!=0)
   {  
   //part of the loop
   System.out.print("Please enter an integer number: ");
   n=keyboard.nextInt();
   //need to add i and n in int
   for(i=2;i<n;i++)
   {
      if(n%i==0)
      {
         System.out.println(n+" is not a prime number!");
         break;
         // add break because it will not make it continue 
      }
     
   }
      if(i==n)
         System.out.println(n+" is a prime number!"); 
     }
   //add condition because it will be two lines of is not and is prime number
   //it will end when user type 0
  }
    // System.out.println(i);
}