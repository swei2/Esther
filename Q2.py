def FixedP(value, digits):
  return "%.*f" % (digits, value)

print("Enter the price: ", end='', flush=True) 
price = float(input()) 
AfterTaxCost = price + 0.05 * price 
print("Total Cost after the sales tax of 5% is applied: " + FixedP(AfterTaxCost,2)) 
