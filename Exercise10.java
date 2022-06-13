import java.util.*;

public class Exercise10//ATM
{
  public static void main(String[] args) //what does ATM do
  {
    //create a single account
    //account acc1 = new Account();
    
    //create a lot of accounts
    Account[] accounts = new Account[10];//class is a data type so use account to replace int
   
   for(int i=0; i<accounts.length; i++)
      accounts[i]=new Account(i, 100.0);//i is use as id
   
   while(true)//will always execute it
   {
     //ask user for id
     Scanner k = new Scanner(System.in);
     System.out.print("Please enter an ID: ");
     //declare local variable
     int id = k.nextInt();
     
     //if id go through, prompt the main menu for user
     
     
     while(true)//for each user
     {
     int choice = menu();//after typing the menu method, type this line
       if(choice==1)
       {
         System.out.println("The balance is: "+ accounts[id].get_balance());
       }
       if(choice==2)
       {
         System.out.print("Enter the amount to withdraw: ");
         double amount = k.nextDouble();
         accounts[id].withdraw(amount);//already have amount down there
       }
       if(choice==3)
       {
         System.out.print("Enter the amount to deposit: ");
         double amount = k.nextDouble();
         accounts[id].deposit(amount);//already have amount down there
       }
       if(choice==4)
       {
        break;
       }
     }
   
   }
   
   }
   //needs to define out of the main method
   public static int menu()//it is main so need to use static// main menu method
  {
    System.out.println("Main Menu");
    System.out.println("1. check balance");
    System.out.println("2. Withdraw");
    System.out.println("3. Deposit");
    System.out.println("4. Exit");
    System.out.print("Enter a choice: ");
    Scanner k = new Scanner(System.in);//local variable
    int choice = k.nextInt();
    return choice;
  }
  
}

class Account //define class
{
  //data fields
  private int id = 0; //don't want anyone has access to it
  private double balance = 0;
  private double annualInterestRate = 0.0;//because is double
  private Date dateCreated; //define under the class, and don't have the default value
  
  //adding methods
  public Account()   //needs to be same as the class name
  {
  //constructors, needs to give intial value
    id=0; 
    balance = 0; 
    annualInterestRate = 0.0; 
    dateCreated=new Date(2019,11,22);
    //four data fields, two constructors // creating 6 methods
  }
  //overloading
  public Account(int id, double balance)//just parameter, local variable
  {
  //reserve key word
  this.id = id;//datafield . id(on the top) =id(local variable)
  this.balance = balance;
  }
  //there are 8 methods, in reality needs to be shorter
  //create an accesstor method for id
  //will be the return type (same integer double)
  public int get_id()//always use get 
  {
    return id;//cannot do in t1.xxx because it is private
  }
  //mutator method for id
  public void set_id(int id) //always use set and have parameter list
  {
    this.id=id;
  }
  //create an accesstor for balance
  public double get_balance()
  {
    return balance;
  }
  //create mutator for balance
  public void set_balance(double balance)
  {
   this.balance = balance;
  }
  //create an accesstor for annualInterestRate
    public double get_annualInterestRate()
  {
    return annualInterestRate;
  }
  //create mutator for annualInterestRate
  public void set_annualInterestRate(double annualInterestRate)
  {
   this.annualInterestRate = annualInterestRate;
  }
  //create an accesstor for Datecreated
  public Date get_dateCreated()
  {
   return dateCreated;
  }
  //create method name that returns the monthly interest rate
  public double getMonthlyInterestRate()
  {
   return annualInterestRate/12;
  }
  //create method name getMonthlyInterest that returns monthly interest
  public double getMonthlyInterest()
  {
   return balance*getMonthlyInterestRate();//because within the account class so no need to be account1.xxx
  //a method needs to have () is not vairable so here needs to have ()
  }
  //create method name withdraw that returns monthly interest rate
  public void withdraw(double amount)//double amount--telling the ATM how much amount I want to withdraw
  //withdraw is changing the datafield 
  //using void so no return
  {
    balance = balance-amount;
  }
  
  public void deposit(double amount)
  {
    balance = balance + amount;
  }
}
