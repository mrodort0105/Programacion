# --- CALCULADORA BÁSICA ---

# 1. Pedir y leer los dos números, convirtiéndolos a float.

num1 = float(input("Introduce el primer número: "))
num2 = float(input("Introduce el segundo número: "))

# 2. Pedir y leer la operación.
operacion = input("Introduce la operación (+, -, *, /, r): ")

# 3. Evaluar la operación seleccionada.

if operacion == '+':
    resultado = num1 + num2
    print(f"Resultado de la SUMA: {resultado}")

elif operacion == '-':
    resultado = num1 - num2
    print(f"Resultado de la RESTA: {resultado}")

elif operacion == '*':
    resultado = num1 * num2
    print(f"Resultado de la MULTIPLICACIÓN: {resultado}")

elif operacion == '/':
    # Manejar el caso especial de división por cero.
    if num2 != 0:
        resultado = num1 / num2
        print(f"Resultado de la DIVISIÓN: {resultado}")
    else:
        print("¡ERROR! No se puede dividir por cero.")

elif operacion == 'r':
    # Raíz cuadrada del primer número.
    # La operación de raíz cuadrada es unaria, por lo que solo se aplica a num1.
    if num1 >= 0:
        resultado = num1 ** 0.5
        print(f"Resultado de la RAÍZ CUADRADA de {num1}: {resultado}")
    else:
        print("¡ERROR! No se puede calcular la raíz cuadrada de un número negativo.")

else:
    # Opción si la operación ingresada no coincide con ninguna de las anteriores
    print("¡ERROR! Operación no válida.")
