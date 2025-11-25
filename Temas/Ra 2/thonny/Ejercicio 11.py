aula1 = ["Juan", "Elena", "Rafa"]
aula2 = ["Sofía", "Carlos", "Diana"]

# Crear el nuevo array (copia profunda de aula1)
nuevo_array = aula1.copy()

# Unir aula2 al nuevo array usando extend()
nuevo_array.extend(aula2)

print(f"Nuevo array resultante (Unión de aulas): {nuevo_array}")
print(f"El Aula 1 original no se ha modificado: {aula1}")