
def main():
    # Pedir un numero decimal al usuario
    num = float(input("Introduce un número decimal (puede ser negativo): "))

    # Convertir a positivo con abs() y redondear con round()
    num_positivo = abs(num)
    num_redondeado = round(num_positivo)

    # Mostrar los resultados
    print(f"Número original: {num}")
    print(f"Número positivo: {num_positivo}")
    print(f"Número redondeado: {num_redondeado}")

# Ejecutar el programa principal
main()
