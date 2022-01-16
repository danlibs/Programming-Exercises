# Sum of all the numbers in a interval determined by the user
x = int(input("Inform the first number in the interval: "))
y = int(input("Inform the last number in the interval: "))
sum = (x + y) * (y / 2)
print("The sum of all values between {} and {} is: {}".format(x, y, int(sum)))
