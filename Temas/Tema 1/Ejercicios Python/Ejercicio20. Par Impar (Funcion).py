# Definimos la funcion
def es_par(numero):
    if numero % 2 == 0:
        return True   # Es par
    else:
        return False  # Es impar

# Programa principal
def main():
    # Pedir al usuario un numero
    n = int(input("Introduce un numero: "))

    # Invocar la función y mostrar el resultado
    if es_par(n):
        print(f"El número {n} es PAR.")
    else:
        print(f"El número {n} es IMPAR.")

# Ejecutar el programa principal
main()
