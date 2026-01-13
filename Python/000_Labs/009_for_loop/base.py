print("We will make a line")
length = int(input("Please enter line length:"))
side = (input("Horizontal or Vertical?"))

x = 0
if side == ("Vertical"):
    for x in range(0,length):
        print(str("|"))
if side == ("Horizontal"): 
    for x in range(0,length):
        print("_", end="")

    
