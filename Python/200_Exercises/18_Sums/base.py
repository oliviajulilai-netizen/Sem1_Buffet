number = int(input("Enter a number:"))
x = 0
Sum = 0 

for x in range(0,number):
    print(str(x) + " + ", end= "")
    Sum = int(x + Sum)
Sum = Sum + number
print(number)
print("The sum of 1 to " + str(number) + " is" + (str(Sum)))