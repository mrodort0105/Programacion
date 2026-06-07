suma = 0

for i in range(1, 101):
    suma += i
    if i < 100:
        print(i, end="+")
    else:
        print(i, end="=")      
  
print("La suma de los nuemeros del 1 al 100 es:", suma )
    

