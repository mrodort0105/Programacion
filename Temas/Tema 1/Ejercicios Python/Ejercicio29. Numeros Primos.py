# Importamos la función isprime de sympy
from sympy import isprime

# Pedimos al usuario que ingrese un número
num = int(input("Introduce un número: "))

# Verificamos si el número es primo
if isprime(num):
    print(f"{num} es un número primo.")
else:
    print(f"{num} no es un número primo.")
