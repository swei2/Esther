import java.util.*;

public class Exercise7
{
  public static void main(String[] args)
  {
    Scanner k = new Scanner(System.in);
    int n=k.nextInt();
    
   if( isprime(n) )
      System.out.println(n+" is a prime number");
   else
      System.out.println(n+" is not a prime number");

  }
  //needs to be in the public class
  //under here is isprime method
  public static boolean isprime(int n)
  {
    if(n==0 || n==1)
      return false;
      
    int denominator=2;
    
    while(denominator<=n-1)
    {
     if(n%denominator == 0)
       return false;//after this will be omit
       
       denominator++;
    }
     return true;
  }
}