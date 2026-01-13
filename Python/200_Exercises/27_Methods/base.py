def add(x, y):
    sum = x + y
    return sum
    
def mult(x, y):
    product = x * y
    return product
    
def printList(lst):
    i = 1
    for item in lst: 
        print(str(i) + ". " + item)
        i = i + 1
        
def numberlist(lst):
    sum = 0
    for num in lst:
        sum = sum + num
    return sum
    
ans = add(5, 7)
print(ans)

ans2 = mult(5, 7)
print(ans2)

christmasList = ["money", "Nintendo 3DS", "Digi camera", "Smoothie", "cat  " ]
printList(christmasList)

favoriteNumbers = [41, 20, 777, 7, 10, 23, 13, 76]
print(numberlist(favoriteNumbers))

