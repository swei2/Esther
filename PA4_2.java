import java.util.*;

public class PA4_2 
{

	   public static void main(String []args){
	   
	   Scanner keyboard = new Scanner(System.in);
	   System.out.print("How many exams? ");
	   int n = keyboard.nextInt();
	   
	   int score = 0;
	   ArrayList<Integer> scoreArray = new ArrayList(); 
	   while(score < n) {
		   System.out.print("Enter a score: ");
		   int i = keyboard.nextInt();
		   n = n-1;
		   scoreArray.add(i);
	   }
	   
	   int max=0;
      for(int i=1;i<scoreArray.size();i++)
        {
          if(scoreArray.get(i-1)>scoreArray.get(i))
           max=scoreArray.get(i-1);
        }
	   
	   double avg=0;
	   for(int i=0;i<scoreArray.size();i++)
		   avg+=scoreArray.get(i);
	   avg = avg/scoreArray.size();
	   
	   
	   System.out.print("The average is "+avg+", "+"The high score is: "+max);
	 }
}
