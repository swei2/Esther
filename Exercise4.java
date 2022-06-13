import java.util.*;

public class Exercise4
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("How many cubes?");
   int n = keyboard.nextInt();
   
   int count=1;
   
   while (count<=n)
   {
      System.out.println(count +" cubed is " + count*count*count);
      count=count+1;
   
   }
   
   //System.out.print( "Done!");
  }
  
}