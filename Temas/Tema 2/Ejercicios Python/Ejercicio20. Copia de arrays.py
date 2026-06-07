from ejercicio19 import comparacion

original = [1, 2, 3, 4, 5]
print("Original:", original)
copia1 = original.copy()

copia2 = original[:]

copia3 = []
# Imprime el elemento
for x in original:
    copia3.append(x)
    
# Imprime el indice    
# for i in range(len(original)):
#     copia3.append(original[i])

copia4 = original

copia4.pop()
copia3.remove(1)

print("\nCopia 1:", copia1)
print("Copia 2:", copia2)
print("Copia 3:", copia3)
print("copia 4:", copia4)
print("Original(pop):", original)

print("\nComparacion:")
print("Copia 1:", comparacion(original, copia1))
print("Copia 2:", comparacion(original, copia2))
print("Copia 3:", comparacion(original, copia3))
print("copia 4:", comparacion(original, copia4))







#TODO: Diferencia entre eliminarlo con pop y con remove?

       
