import random 
numbers = int(input("How many random numbers do you want?"))
x = 0
num = ["1" , "2" , "3" , "4" , " 5" , "6" , "7" , "8" , "9" , "10"]
for x in range(0,numbers):
    print(random.randrange(10)) 