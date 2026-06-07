suma = 0

for i in range(100, 0, -1):
    suma += i
    if i > 1:
        print(i, end="+")
    else:
        print(i, end="=")      
  
print("La suma de los nuemeros del 1 al 100 es:", suma )
    
