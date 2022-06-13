total_donation = 0
for i in range(1, 11):
    donation = int(input("Enter donation amount by donor " + str(i) + ": "))
    while donation < 0:
        donation = int(input("Cannot be negative. Enter donation amount by donor " + str(i) + ": "))
    total_donation += donation
print("Total donation amount is", total_donation)
