# Pedir nota al usuario
nota = float(input("Ingresa tu nota (0-10): "))

# Verificar y mostrar calificación
if nota >= 9 and nota <= 10:
    print("Calificación: Sobresaliente")
elif nota >= 7:
    print("Calificación: Notable")
elif nota >= 6:
    print("Calificación: Bien")
elif nota >= 5:
    print("Calificación: Suficiente")
elif nota >= 0:
    print("Calificación: Insuficiente")
else:
    print("Error: La nota debe estar entre 0 y 10.")
