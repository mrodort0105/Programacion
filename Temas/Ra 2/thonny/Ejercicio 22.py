matriz = [
    ['A', 'D', 'G'],
    ['B', 'E', 'H'],
    ['C', 'F', 'I']
]

# Imprimir con WHILE
print("Impresión con WHILE:")
i = 0
while i < len(matriz): 
    j = 0
    while j < len(matriz[i]): 
        print(matriz[i][j], end=" ")
        j += 1
    print() 
    i += 1

# Imprimir con FOR-EACH
print("\nImpresión con FOR-EACH:")
for fila in matriz:
    for elemento in fila:
        print(elemento, end=" ")
    print()