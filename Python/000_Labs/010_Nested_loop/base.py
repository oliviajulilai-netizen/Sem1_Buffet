symbol = (input("What symbol would you like to use?"))
width = int(input("What is the width of your box?"))
height = int(input("What is the height of your box?"))

x = 0
for x in range (0,height):
    for x in range (0,width):
        print(symbol, end="")
    print()


    