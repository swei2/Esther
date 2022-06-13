import math
print ("Enter a number: ", end = '')
num = float(input())
while(num < 0):
    print("It is not a valid number, please enter another number!")
    num = float(input())
res = math.sqrt(num)
print("Square root of ", num, "is", res)
