total = 0
count = 0
for i in range(5):
   g = float(input('Enter gpa for student {}: '.format(i+1)))
   total = total + g
   count = count + 1

avg = total / count
print('Average GPA: {:.1f}'.format(avg))
