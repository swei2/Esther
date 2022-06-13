import java.util.*;

public class Exercise8
{
  public static void main(String[] args) //array of strings
  {
  //declare array if type int
      //int[] array1 = {3, 7, 4, 8, 2};
   // max(a);//no compiling error here
      //System.out.println("The biggest value in array1 is: "+ max(array1));
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the size of your data: ");
    int n=keyboard.nextInt();
    
    int[] array2 = new int[n];//make the size of n
    
    
    System.out.println("Please enter those data: ");
    for(int i=0; i<array2.length; i++) //without this section, the biggest number will be 0
       {
       array2[i]=keyboard.nextInt();// this is the place for the user to type in their own numbers
       }
       
    System.out.println("The biggest value in array2 is: "+ max(array2));
    
    System.out.println("Please enter a target value: ");
    int target = keyboard.nextInt();
    
    if(search(array2, target))//find the target in array2
       System.out.println("Target is found in data set. ");
     else
       System.out.println("Target is not found in data set. ");
  }
  //return type
  //[]whole array will be inside []
  public static int max(int[] a)//either name is fine no need to be array
  //Here start the method
  {
   int result = a[0];//use a but not array because array has been declare in another place
   //result will keep track of the biggest value so far
   for(int i=0; i<a.length; i++)//in this case a.length is 5 for array1 and 100 for array2 because include 0 //a.length--size method
   {
     if(a[i]>result)
       result=a[i];
   }
   
    return result;
  }

    public static boolean search(int[] a, int target)
    {
      for(int i=0; i<a.length; i++)
      {
        if(target==a[i])
          return true;
      }
      return false;
    }

}