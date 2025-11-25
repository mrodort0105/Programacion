suma_pares = 0
for numero in range(1, 101):
    # Comprobamos si el número es par
    if numero % 2 == 0:
        suma_pares += numero

print("La suma con bucle for y condición if es:",suma_pares)
