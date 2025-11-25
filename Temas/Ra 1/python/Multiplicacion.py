# Pedir al usuario que ingrese el número
numero = int(input("Ingresa el número del que deseas ver la tabla de multiplicar: "))

# Imprimir el encabezado de la tabla
print(" Tabla de multiplicar del {numero}")

# Usar un bucle for para generar los productos del 1 al 10
for i in range(1, 11):
    # Calcular el producto
    producto = numero * i
    # Imprimir el resultado en un formato legible
    print("{numero} x {i} = {producto}")


