# Solicitar cantidad (se asume que la cantidad es válida y > 0)
cantidad = int(input("¿Cuántos números enteros deseas introducir? "))
numeros = []
contador = 0

# Introducir números usando WHILE
print("\nIntroduce los números:")
while contador < cantidad:
    num = int(input(f"Número {contador + 1}: "))
    numeros.append(num)
    contador += 1

print(f"\nArray original: {numeros}")

# Mostrar en orden inverso usando FOR RANGE
print("Números en orden inverso (For Range):")
# Recorre desde el último índice (len-1) hasta el -1 (inclusive el índice 0) con paso -1
for i in range(len(numeros) - 1, -1, -1):
    print(numeros[i], end=" ")
print()