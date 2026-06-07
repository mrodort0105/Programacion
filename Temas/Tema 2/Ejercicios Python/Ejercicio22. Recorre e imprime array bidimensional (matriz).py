matriz = [
    ["A", "B", "C"],
    ["D", "E", "F"],
    ["G", "H", "I"]
]

filas = len(matriz)
columnas = len(matriz[0])

f = 0
c = 0
print("Con While:")
while c < columnas:
    i = 0
    while i < filas:
        print(matriz[i][c], end=" ")
        i = i + 1
    c = c + 1

print("\nCon for-each:")
f = 0
for f in matriz:
    for x in f:
        print(x, end=" ")
