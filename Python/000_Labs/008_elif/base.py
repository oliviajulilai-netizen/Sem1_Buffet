print("Calculator app")
x = int(input("Please enter the first number:"))
xx = (input("Please enter an operation:"))
xxx = int(input("Please enter the second number:"))
if xx == "addition":
   print(x + xxx)
elif xx == "subtraction":
    print(x - xxx)
elif xx == "multiplication":
    print(x*xxx)
elif xx == "division":
    print(x/xxx)
