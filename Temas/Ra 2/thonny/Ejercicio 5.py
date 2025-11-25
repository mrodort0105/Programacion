numeros_decimales = []
print("Introduce 5 números decimales:")

for i in range(5):
    # En un programa real, se debe validar la entrada
    num = float(input(f"Número {i + 1}: ")) 
    numeros_decimales.append(num)

print("\nNúmeros introducidos:")
print(numeros_decimales)