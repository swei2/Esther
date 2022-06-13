import java.util.*;

public class PA6_1
{
  public static void main(String[] args)
  {
    Scanner k = new Scanner(System.in);

      System.out.print("How many prime numbers do you want? ");
      int n=k.nextInt();   
      System.out.println("The first " +n+ " prime numbers are: ");
      
      int temp=2;
      while(n!=0) {
    	  if( isprime(temp) ) {
    		  System.out.println(temp); 
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
  
  
}