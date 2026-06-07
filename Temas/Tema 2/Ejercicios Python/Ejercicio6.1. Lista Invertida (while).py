# Pedimos al usuario que ingrese numeros
cantidad = int(input("Cuantos numeros desea introducir? "))

# Creamos lista 
numeros = []

# Leemos numeros
for i in range(cantidad):
    n = int(input(f"Introduce el numero {i+1}: "))
    numeros.append(n)

i = len(numeros) -1
# Mostramos la lista invertida
while i >= 0:
    print(numeros[i])
    i -= 1
