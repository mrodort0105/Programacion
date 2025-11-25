def busqueda_secuencial(array, objetivo):
    """Implementación manual de la búsqueda secuencial."""
    for i in range(len(array)):
        if array[i] == objetivo:
            return i 
    return -1

numeros = [45, 12, 77, 34, 91]
buscar = 77

# Invocación del método creado
indice_secuencial = busqueda_secuencial(numeros, buscar)
print(f"Array: {numeros}")
print(f"Buscando {buscar}:")
print(f"Resultado Secuencial: Posición {indice_secuencial}")

# Comparar con el método index
try:
    indice_nativo = numeros.index(buscar)
    print(f"Resultado .index(): Posición {indice_nativo}")
except ValueError:
    print(f"Resultado .index(): No encontrado")