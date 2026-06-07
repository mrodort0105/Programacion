suma = 0

# Pedimos el primer número
numero = int(input("Introduce un número (0 para terminar): "))

# Bucle para que mientras el número no sea 0, seguimos acumulando
while numero != 0:
    suma += numero  # Acumulamos
    numero = int(input("Introduce otro número (0 para terminar): "))

print("La suma total es:", suma)
