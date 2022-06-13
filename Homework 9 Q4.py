lst = []
for i in range(4):
   n = int(input("Enter integer: "))
   lst.append(n)
for x in lst:
   if(x%2==0):
      print(x,"is even")
   else:
      print(x, "is odd")
