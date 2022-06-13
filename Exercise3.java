import java.util.*;

public class Exercise3
{
  public static void main(String[] args)
  {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Please enter a score: ");
  //this is the main part of the code except for the else if part
     int score = keyboard.nextInt();
     char grade;
     if(score>=0&&score<=100)
     {
      if(score>=90)
      //should be system... but change to grade because type the char up there
      //in order to make it simpler
        grade='A';
      else if (score>=80)
        grade='B';
      else if (score>=70)
        grade='C';
      else if (score>=60)
        grade='D';
      //matches the closest else if
      else 
        grade='F';
        
      //print of the grade letter
      System.out.println("Letter grade: "+grade);
     }
     else
     {
       System.out.println("Invalid score!");
     }
     
     
     
  
  }
}