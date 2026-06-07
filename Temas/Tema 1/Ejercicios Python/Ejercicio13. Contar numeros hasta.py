
# Pedir al usuario un número entero positivo
n = int(input("Introduce un número entero positivo: "))

if n > 0:
    for i in range(1, n + 1):
        print(i)
else:
    print("Por favor, introduce un número entero positivo.")
