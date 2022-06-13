import java.util.*;

public class PA8_1
{   
   public static void main(String[] args)
     {
       Dog mydog = new Dog();
       mydog.input();
       mydog.writeOutput();
     }
}
class Dog
{
        public String name;
        public String breed;
        public int age;
       public double weight;

        public void writeOutput()
        {
                System.out.println("Name: " + name);
                System.out.println("Breed: " + breed);
                System.out.println("Age in calendar years: " + age);
                System.out.println("Age in human years: " + getAgeInHumanYears());
               System.out.println("Weight in pounds: "+weight);
                System.out.println();
        }

   public int getAgeInHumanYears()
    {
      int humanYears = 0;
        if (age <= 2)
         {
          humanYears = age * 11;
         }
        else
         {
            humanYears = 22 + ((age-2) * 5);
                }
                return humanYears;
        }
     public void input()
       {
           Scanner k= new Scanner(System.in);
          
           System.out.print("Enter the name of the dog: ");
           name=k.nextLine();
          
           System.out.print("Enter the age of the dog: ");
           age=k.nextInt();
           k.nextLine();
           System.out.print("Enter the breed of the dog: ");
           breed=k.nextLine();
          
           System.out.print("Enter the weight of the dog(pounds): ");
           weight=k.nextDouble();
    
          
       }
}