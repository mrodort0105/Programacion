# Solicitamos al usuario 3 valores para calcular la forma del triagulo
a = int(input("Ingresa el primer valor:"))
b = int(input("Ingresa el segundo valor"))
c = int(input("Ingresa el tercer valor"))

# Operaciones para determinar el tipo de triangulo
if (a + b > c) and (b + c > a) and (c + a > b):
    if (a == b) or (b == c):
        print("El triangulo es equilatero")
    elif (a == b) or (a == c) or (b == c):
        print("El triangulo es Isosceles")
    else:
        print("El triangulo es Escaleno")
else:
    print("los valores ingresados no forman un triangulo")
            
