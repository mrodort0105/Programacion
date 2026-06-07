# end=" ": Hace es evitar el salto de linea y finaliza en un espacio o lo que tu pongas.

m = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Elementos de fila 1 y columnas 1 y 2:")
print(m[1][2])
print(m[1][1])


print("Elementos de la fila 1:")
print(m[1]) # Manera facil de imprimirlo

# Manera dificil de imprimirlo
for fila in m[1]:
    print(fila, end=" ")

print("\nTodos los elementos de m:")
for fila in m:
    for x in fila:
        print(x, end=" ")
    print()
    
print("\nTodos los multiplos de 2 de m:")
m2 = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
]

for f in range(3):
    for e in range(3):
        if m[f][e] % 2 == 0:
            m2[f][e] = (m[f][e])
            m[f][e] = 0
            
print("Lista m:")
for fila in m:
    print(fila)
    
print("\nLista m2:")
for fila in m2:
    print(fila)
    

