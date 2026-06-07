# Crear lista para almacenar los numeros
lista = []

# Pedir al usuario 5 numeros
for i in range(5):
    num = float(input(f"Introduce el numero decimal {i+1}: "))
    lista.append(num)

# Ahora se muestran los numeros en el mismo orden
print("Los numeros ingresados son:")
for num in lista:
    print(num)

