def busqueda_binaria(lista_ordenada, objetivo):
    """Implementa el algoritmo de búsqueda binaria (O(log n))."""
    inicio = 0
    fin = len(lista_ordenada) - 1
    
    while inicio <= fin:
        medio = (inicio + fin) // 2 
        
        if lista_ordenada[medio] == objetivo:
            return medio  # Encontrado
        elif lista_ordenada[medio] < objetivo:
            inicio = medio + 1  # Busca en la mitad derecha
        else:
            fin = medio - 1     # Busca en la mitad izquierda
            
    return -1

numeros = [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
buscar = 23
indice = busqueda_binaria(numeros, buscar)

print(f"Buscando {buscar} en {numeros}")
print(f"El número se encuentra en el índice: {indice}")