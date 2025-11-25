# 1. Solicitar y leer el año, asegurando que sea un entero.
try:
    anio = int(input("Introduce un año (ej: 2024): "))
except ValueError:
    print("Error: Por favor, introduce un número entero válido.")
    exit()

# 2. Aplicar la lógica del año bisiesto.
# Un año es bisiesto si:
# (Es divisible por 4) AND ( (No es divisible por 100) OR (Sí lo es por 400) )

if (anio % 4 == 0) and ((anio % 100 != 0) or (anio % 400 == 0)):
    print(f"El año {anio} ES bisiesto.")
else:
    print(f"El año {anio} NO es bisiesto.")
