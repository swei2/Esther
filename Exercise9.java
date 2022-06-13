import java.util.*;

public class Exercise9
{
  public static void main(String[] args) //will add the main method here
  {
  //now we are declaring time but not x
    Time t1 =new Time(); //new is the invoke of the the constructure 
    //t1 have hour minute second, is the object for time class
    t1.input();//t1. method of the class
    t1.PrintMilitaryTime();//invoke t1
    t1.PrintStandardTime();//don't forget the empty ()
  }
}

class Time//declare the another class out of the Exercise9 to define our own class
{
  //data fileds
  int hour, minute, second;//declare three data filed, can be separated too
  
  //methods (can be private and can be public too)
  //input is the method
  public void input()//static is removed here, method is not static, void does not return anything
  //you can declare as much as variables in input but only the variables not in the data fields
  //if declare inside will be the local variable
  {
    //Scanner is the object name
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter the hour: ");
    hour = keyboard.nextInt();//didn't declare in this method but still can use because it is within the time class and it is already declare in data fields
    //should not redeclare the hour, minute, second
    System.out.print("Enter the minute: ");
    minute = keyboard.nextInt();
    System.out.print("Enter the second: ");
    second = keyboard.nextInt();
  
  }
  
  //Define the second method
  public void PrintMilitaryTime()
  {
    System.out.println("Based on your entry, the Military time is "+hour +":"+ minute+":"+second);//design the output
  }
  public void PrintStandardTime()//print 1 instead of 13
  {
    if(hour<12)//without declaring because is in the time class and it is data fields
     System.out.println("Based on your entry, the Standard time is "+hour +":"+ minute+":"+second+"AM");
    else
     System.out.println("Based on your entry, the Standard time is "+(hour-12) +":"+ minute+":"+second+" PM");
     //this will make the 13 into 1 

  }
}

