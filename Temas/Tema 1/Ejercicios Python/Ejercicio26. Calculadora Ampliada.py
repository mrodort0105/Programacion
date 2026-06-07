# Creamos un menu 
print("----------------------------")
print("|=== CALCULADORA BÁSICA ===|")
print("|Selecciona una opción:    |")
print("|1. Suma                   |")
print("|2. Resta                  |")
print("|3. Multiplicación         |")
print("|4. División               |")
print("----------------------------")

# Pedimos opción al usuario
opcion = input("Ingresa el número de la operación (1-4): ")

# Pedir números
num1 = float(input("Ingresa el primer número: "))
num2 = float(input("Ingresa el segundo número: "))

# Realizar la operación segun la opcion del ususario
if opcion == "1":
    resultado = num1 + num2
    print(f"La suma es:", resultado)
elif opcion == "2":
    resultado = num1 - num2
    print(f"La resta es:", resultado)
elif opcion == "3":
    resultado = num1 * num2
    print(f"La multiplicación es:", resultado)
elif opcion == "4":
    if num2 != 0:
        resultado = num1 / num2
        print(f"La división es:", resultado)
    else:
        print("Error: No se puede dividir entre 0.")
else:
    print("Opción inválida.")
