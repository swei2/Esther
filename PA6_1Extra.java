import java.util.*;

public class PA6_1Extra
{
  public static void main(String[] args)
  {
    Scanner k = new Scanner(System.in);

      System.out.print("How many prime numbers do you want? ");
      int n=k.nextInt();   
      System.out.println("The first " +n+ " prime numbers are: ");
      int count = 0;
     
      int temp=2;
      while(n!=0) {
    	  if( isprime(temp) ) {
           count++;
    		  System.out.println("The "+count+findrank(count)+" prime number is "+temp); 
    		  n--;
    	  }
    	  temp++;
      }



  }

  public static boolean isprime(int i)
  {
    if(i==0 || i==1)
      return false;
      
    int denominator=2;
    
    while(denominator<=i-1)
    {
     if(i%denominator == 0)
       return false;//after this will be omit
       
       denominator++;
    }
     return true;
  }
  
  public static String findrank(int r)
  {
     int hundredRemainder = r % 100;
     int tenthRemainder = r % 10;
     
      if (hundredRemainder - tenthRemainder == 10) 
      {
         return "th";
      }
      switch (tenthRemainder) 
      {
        case 1:
          return "st";
        case 2:
          return "nd";
        case 3:
          return "rd";
        default:
          return "th";
      }
  }
  
}