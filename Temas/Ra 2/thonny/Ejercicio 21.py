M = [
    ["X", "O", "X"],  # Fila 0
    ["O", "X", "O"],  # Fila 1
    ["X", "O", "X"]   # Fila 2
]

# 2. Accede a la posición central (Fila 1, Columna 1)
print(f"Posición central (1, 1): {M[1][1]}")

# 3. Recorre solo la segunda fila (índice 1)
print("\nRecorrido de la segunda fila (Índice 1):")
for elemento in M[1]:
    print(elemento, end=" ")
print()

# 4. Recorrido anidado de toda la matriz (simular matriz visualmente)
print("\nRecorrido anidado (Visual):")
for fila in M:
    for elemento in fila:
        print(elemento, end=" ")
    print()

# 5. Recorrer la matriz y extraer múltiplos de 2 a otra matriz M2
M3 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# M2 contendrá el valor si es par, o 0 si es impar
M2 = [[M3[i][j] if M3[i][j] % 2 == 0 else 0 for j in range(3)] for i in range(3)]

print("\nMatriz M2 (Solo múltiplos de 2):")
for fila in M2:
    print(fila)