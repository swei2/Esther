name= input("Enter your name:")
debt1= float(input("Enter the amount of debt1:")) 
debt2= float(input("Enter the amount of debt2:")) 
total=debt1 + debt2

if (total>900000):
    print(name + "Alert! You have too much debt")
elif (total>450000):
    print(name + "Please reduce your debt.")
else:
    print(name+ " Congratulations! you are safe!")

