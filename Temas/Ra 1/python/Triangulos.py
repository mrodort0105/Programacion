# Función para determinar el tipo de triángulo
def determinar_tipo_triangulo(a, b, c):
    # 1. Verificar la condición de existencia del triángulo
    # La suma de dos lados debe ser mayor que el tercero
    if not (a + b > c and a + c > b and b + c > a):
        return "Los lados NO forman un triángulo válido."
    
    # 2. Determinar el tipo de triángulo
    # Equilátero: todos los lados iguales
    if a == b and b == c:
        return "El triángulo es Equilátero."
    # Isósceles: al menos dos lados iguales (ya se excluyó el equilátero)
    elif a == b or a == c or b == c:
        return "El triángulo es Isósceles."
    # Escaleno: todos los lados diferentes
    else:
        return "El triángulo es Escaleno."

# Entrada de datos
try:
    lado1 = float(input("Ingrese la longitud del primer lado (a): "))
    lado2 = float(input("Ingrese la longitud del segundo lado (b): "))
    lado3 = float(input("Ingrese la longitud del tercer lado (c): "))

    if lado1 <= 0 or lado2 <= 0 or lado3 <= 0:
        print("Las longitudes de los lados deben ser números positivos.")
    else:
            # Llamar a la función y mostrar el resultado
        resultado = determinar_tipo_triangulo(lado1, lado2, lado3)
        print(f"\nResultado: {resultado}")

except ValueError:
    print("Error: Ingrese un valor numérico válido para las longitudes.")
