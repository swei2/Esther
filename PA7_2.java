import java.util.*;

public class PA7_2
{
  public static void main(String args[])
  {
    Scanner keyboard=new Scanner(System.in);
    int arr[]=new int[10];
    System.out.print("Enter ten numbers: ");
    for(int i=0;i<10;i++)
    {
      arr[i]=keyboard.nextInt();
    }
    System.out.println("The minimum number is: "+min(arr));

    int newArray[]=new int[10];
    newArray=sort(arr);

    System.out.print("The sorted numbers: ");
    for(int i=0;i<10;i++)
     {
       System.out.print(newArray[i]+" ");
     }
  }
  public static int min(int[] array)
   {
    int i;
    int result=array[0];
    for(i=0;i<=9;i++)
   {
   if(result>array[i])
   {
     result=array[i];
   }
  }
    return result;
  }

  public static int[] sort(int[] list)
  {
    int i,j;
    for(i=0;i<=9;i++)
     {
    for(j=i+1;j<=9;j++)
     {
      if(list[i]>list[j])
     {
      int temp=list[i];
      list[i]=list[j];
      list[j]=temp;
    }
    }
    }
  return list;
  }
}
