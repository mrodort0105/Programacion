# --- CALIFICACIÓN POR NOTA ---

# 1. Solicitar y leer la nota, asegurando que sea un número (float).
try:
    nota = float(input("Introduce la nota numérica (0 a 10): "))
except ValueError:
    print("Error: Por favor, introduce un valor numérico válido.")
    exit()

# 2. Evaluar la nota.

if nota < 0 or nota > 10:
    # Manejo de errores si la nota está fuera del rango 0-10
    print("Error: La nota debe estar entre 0 y 10.")
    
# Evaluamos los rangos de forma descendente:
elif nota >= 9:
    # 9-10
    print("La calificación es: Sobresaliente ")

elif nota >= 7:
    # 7-8
    print("La calificación es: Notable ")

elif nota >= 6:
    # 6
    print("La calificación es: Bien ")

elif nota >= 5:
    # 5
    print("La calificación es: Suficiente ")

else:
    # 0-4 (Si llega aquí, la nota es >= 0 y < 5)
    print("La calificación es: Insuficiente ")
