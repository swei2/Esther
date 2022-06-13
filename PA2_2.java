import java.util.*;

public class PA2_2
{
  public static void main(String[] args)
  {
   Scanner keyboard = new Scanner(System.in);
   System.out.println("The retail price is $99");
   double retail_price = 99;
   
     System.out.print("Enter the quantity: ");
     int quantity = keyboard.nextInt();
   if (quantity < 10)
      {
      double discount = (double)(retail_price * quantity*0);
      double total = (double)(retail_price * quantity);
      System.out.println("The discount is $" + discount);
      System.out.println("The total price is $" + total);
       }
       else if (quantity < 20)
       {
      double discount = (double)(retail_price*quantity*0.1);
      double total = (double)(retail_price*quantity-discount);
      System.out.println("The discount is $" + discount);
      System.out.println("The total price is $" + total);
       }
       else if (quantity < 50)
       {
      double discount = (double)(retail_price*quantity*0.2);
      double total = (double)(retail_price*quantity - discount);
      System.out.println("The discount is $" + discount);      
      System.out.println("The total price is $" + total);
       }
       else if (quantity < 100)
       {
      double discount = (double)(retail_price*quantity*0.3);
      double total = (double)(retail_price*quantity-discount); 
      System.out.println("The discount is $" + discount);           
      System.out.println("The total price is $" + total);
       }
    else
    {
      double discount = (double)(retail_price*quantity*0.4);
      double total = (double)(retail_price*quantity-discount);
      System.out.println("The discount is $" + discount);
      System.out.println("The total price is $" + total);
}
   }
  
}