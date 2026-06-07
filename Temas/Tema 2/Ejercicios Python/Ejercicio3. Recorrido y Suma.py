# Creamos el array
numeros = [25, 12, 30, 10, 8]

# Primera forma usando for
suma_for = 0
for num in numeros:
    suma_for += num
print("Suma con for:", suma_for)

# Segunda forma usando while
suma_while = 0
i = 0
while i < len(numeros):
    suma_while += numeros[i]
    i += 1
print("Suma con while:", suma_while)
