# Creamos funcion para recorrer la lista y encontrar el valor maximo
def maximo(t):
    # Asumimos que t no tiene nada
    max_valor = t[0]
    for num in t:
        if num > max_valor:
            max_valor = num
    return max_valor
    
# Utilizamos la funcion
tabla = [5, 12, 3, 20, 8]
print("El valor máximo es:", maximo(tabla))

