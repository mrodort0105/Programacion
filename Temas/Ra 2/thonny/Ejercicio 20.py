original = [1, 2, 3, 4, 5]

# 2. Copia usando .copy()
copia1 = original.copy()

# 3. Copia usando slicing
copia2 = original[:]

# 4. Copia manual
copia3 = []
for x in original:
    copia3.append(x)

# 5. Asignación por referencia (Copia superficial, NO crea una nueva estructura)
copia4 = original 

# Demostración de asignación por referencia:
copia4.pop() # Elimina el 5 de copia4
print(f"\nTras pop() en copia4, ORIGINAL es: {original}") # El 5 desaparece de ORIGINAL

# Demostración de copia profunda:
copia3.pop(0) # Elimina el 1 de copia3
print(f"Tras pop(0) en copia3, ORIGINAL sigue siendo: {original}") # ORIGINAL no se ve afectado