import random

# Funcion para buscar un numero en la lista
def buscar_numero(numero, lista):
    for i in range(len(lista)):
        if lista[i] == numero:
            return i  
    return -1  

# Creamos array con 5 numeor random
numeros = [random.randint(1, 10) for _ in range(5)]
#print("Array generado:", numeros)

# Pedimos al usuario numero
num_usuario = int(input("Introduce un numero para buscar:"))

# Buscamos el numero con la funcion creada
resultado = buscar_numero(num_usuario, numeros)
print("Resultado:", resultado)

# Comparacion con metodo index()
try:
    posicion_numero = numeros.index(num_usuario)
    print(f"{num_usuario} se encuentra en la posicion: {posicion_numero}")
except ValueError:
    print("El numero no fue usado")
