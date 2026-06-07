# Pedimos al usuario que ingrese numeros
cantidad = int(input("Cuantos numeros desea introducir? "))

# Creamos lista 
numeros = []

# Leemos numeros
for i in range(cantidad):
    n = int(input(f"Introduce el numero {i+1}: "))
    numeros.append(n)

# Mostramos la lista invertida
print("Numeros en orden inverso:")
for n in numeros[::-1]:
    print(n)
