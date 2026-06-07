p = [
    [5.0, 10.5],
    [8.2, 15.0],
    [1.5, 3.0]
]

# Suma con while 
print("Usando While:")
suma = 0
i = 0
while i < len(p):
    suma = suma + p[i][1]
    i += 1

print("Suma:", suma)

# For-each
print("\nUsando For-each:")
suma = 0
for fila in p:
    suma = suma + fila[1]

print("Suma:", suma)

# For
print("\nUsando for:")
suma = 0
for i in range(len(p)):
    suma = suma + p[i][1]

print("Suma:", suma)
