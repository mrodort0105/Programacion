# 1. Solicitar y leer el número, asegurando que sea un entero.
try:
    numero = int(input("Introduce un número entero: "))
except ValueError:
    print("Error: Por favor, introduce un número entero válido.")
    exit()

# 2. Evaluar el módulo (resto) de la división por 2.
if (numero % 2) == 0:
    # Si el resto es 0, es par.
    print(f"El número {numero} es PAR.")
else:
    # Si el resto no es 0, es impar.
    print(f"El número {numero} es IMPAR.")
