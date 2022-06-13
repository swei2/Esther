import java.util.*;

public class PA7_1 
{

	   public static void main(String []args){
	   
   
      Scanner keyboard = new Scanner(System.in);   
	   double score = 0;
	   ArrayList<Double> scoreArray = new ArrayList(); 
      double[] arr = new double[5];
	   for(int i=0; i<5; i++) {
		   System.out.print("Enter a score: ");
		   arr[i] = keyboard.nextDouble();
		   scoreArray.add(arr[i]);
        
	   }     
	   double avg=0;
	   for(int i=0;i<5;i++)
		avg+=scoreArray.get(i);
      avg = avg/scoreArray.size();
      System.out.println("The average score is "+ avg);
      
      for(int i=0; i<5; i++)
      {
      if(arr[i] > avg)
      {
       System.out.println(arr[i]+" is above average by " +String.format("%.2f", (arr[i] - avg)));
      }
      else
      {
       System.out.println(arr[i]+" is below average by " +String.format("%.2f", (avg - arr[i])));
      }
      }
      
}
}