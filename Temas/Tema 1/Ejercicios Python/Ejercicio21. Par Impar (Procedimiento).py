# Definimos un procedimiento 
def mostrar_paridad(numero):
    if numero % 2 == 0:
        print(f"El numero {numero} es PAR.")
    else:
        print(f"El numero {numero} es IMPAR.")

# Programa principal
def main():
    n = int(input("Introduce un numero: "))
    # Invocamos el procedimiento
    mostrar_paridad(n)

# Ejecutar el programa principal
main()
