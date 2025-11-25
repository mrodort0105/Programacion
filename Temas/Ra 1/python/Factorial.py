numero = int(input("Introduce un número entero no negativo: "))

# 2. Manejar casos especiales (0 y negativos)
if numero < 0:
    print("El factorial no está definido para números negativos.")
elif numero == 0:
    print("El factorial de 0 es 1")
else:
    # 3. Inicializar el resultado
    resultado = 1

    # 4. Bucle iterativo simple
    for i in range(1, numero + 1):
        resultado *= i # Multiplica el resultado por i en cada paso

    # 5. Mostrar el resultado
    print(f"El factorial de {numero} es {resultado}")
