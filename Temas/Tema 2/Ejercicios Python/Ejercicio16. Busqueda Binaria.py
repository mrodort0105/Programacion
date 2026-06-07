def busquedaBinaria(lista, objetivo):
    inicio = 0              
    fin = len(lista) - 1   

    while inicio <= fin: 
        medio = (inicio + fin) // 2

        if lista[medio] == premio:
            return medio
        
        elif lista[medio] < premio:
            inicio = medio + 1
            
        else:
            fin = medio - 1

    return -1

numeros = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

premio = int(input("Ingrese un nmero a buscar: "))

resultado = busquedaBinaria(numeros, premio)

if resultado != -1:
    print(f"Numero encontrado en la posicion {resultado}")
else:
    print("Numero no encontrado")
