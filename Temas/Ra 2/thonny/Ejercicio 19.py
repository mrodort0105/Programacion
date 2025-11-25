def mi_algoritmo_comparacion(array_a, array_b):
    """Compara dos arrays verificando longitud, valores y orden."""
    # La comparación nativa 'a == b' ya cumple este requisito en Python

    # 1. Comprobar longitud
    if len(array_a) != len(array_b):
        return False
    
    # 2. Comprobar valores en el mismo orden
    for i in range(len(array_a)):
        if array_a[i] != array_b[i]:
            return False
            
    return True

lista_a = [10, 20, 30]
lista_c = [30, 20, 10]
lista_d = [10, 20]

print(f"A y B (iguales): {mi_algoritmo_comparacion(lista_a, [10, 20, 30])}") # True
print(f"A y C (diferente orden): {mi_algoritmo_comparacion(lista_a, lista_c)}") # False
print(f"A y D (diferente longitud): {mi_algoritmo_comparacion(lista_a, lista_d)}") # False