
# A String variable can be made upper or lower case given the following methods
str = str.lower()
str = str.upper()
# These commands turn the entire String to upper or lower case and stores it back in str

# The following loop goes through each letter in str one by one. 
# char becomes each letter for each loop!
str = input(" ")
x = 1
for char in str:
    if x % 2 == 0:
        print(char.lower(), end = "")
    else:
        print(char.upper(), end = "")
    x = x + 1
    

