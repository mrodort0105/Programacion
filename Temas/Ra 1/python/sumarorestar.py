# 1. Solicitar y leer los dos números, convirtiéndolos a float para permitir decimales.
try:
    num1 = float(input("Introduce el primer número: "))
    num2 = float(input("Introduce el segundo número: "))
except ValueError:
    print("Error: Por favor, introduce números válidos.")
    exit()

# 2. Evaluar las condiciones.
if num1 > num2:
    # Caso 1: num1 es mayor que num2
    print(f"El número mayor es: {num1}")
elif num2 > num1:
    # Caso 2: num2 es mayor que num1
    print(f"El número mayor es: {num2}")
else:
    # Caso 3: Si no es mayor ni el uno ni el otro, deben ser iguales.
    print(f"Los números son iguales: {num1}")
