def sumar_con_acumulacion_parcial():
    """
    Suma números ingresados por el usuario, mostrando la suma parcial en cada paso,
    hasta que se introduce 0.
    """
    suma_total = 0
    
    print("Inicia la suma acumulativa. Introduce números enteros.")
    print("Escribe 0 para finalizar.")

    while True:
            # 1. Solicitar el número al usuario
            entrada = input("Introduce un número (Suma actual: {}): ".format(suma_total))
            numero = int(entrada)
            
            # 2. Condición de Parada
            if numero == 0:
                # El usuario pulsó 0, salimos del bucle.
                break
            
            # 3. Acumulación Parcial
            # Se suma el número actual a la suma total
            suma_total += numero
            
            # 4. Mostrar la suma después de cada ingreso
            print("-> Acumulado: {suma_total}")


