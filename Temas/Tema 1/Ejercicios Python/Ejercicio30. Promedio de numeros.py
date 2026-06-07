suma = 0
contador = 0

while True:
    entrada = input("Introduce un número (o presiona espacio para terminar): ")
    if entrada == " ":
        break
    numero = float(entrada)  # asumimos que siempre es un número válido
    suma += numero
    contador += 1

if contador > 0:
    promedio = suma / contador
    print(f"El promedio de los números introducidos es: {promedio}")
else:
    print("No se introdujeron números.")
