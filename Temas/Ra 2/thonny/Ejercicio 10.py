alumnos = ["Ana", "Luis", "Marta", "Pedro"] 
print(f"Array Original: {alumnos}")

alumno_a_insertar = "Sofía"
posicion_insercion = 2 # Índice del 3er elemento ('Marta')
alumnos.insert(posicion_insercion, alumno_a_insertar)

print(f"Array Resultado (tras insert en índice {posicion_insercion}): {alumnos}")