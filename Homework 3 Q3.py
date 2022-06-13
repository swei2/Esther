First_Name = input("Enter your First name: ")

Bank_Balance = input("Enter your bank balance: ")

Deposit_Amount = input("Enter your Deposit amount: ")

Bank_Balance = float(Bank_Balance)

Deposit_Amount = float(Deposit_Amount)

total = Bank_Balance + Deposit_Amount

print("Name of account holder:"+First_Name + "\n"+"Total Balance in account:")

print("{:.2f}".format(total))
