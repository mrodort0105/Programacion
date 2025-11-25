def maximo(t):
    """Devuelve el valor máximo contenido en la tabla (array) t."""
    if not t:
        return None # Caso de lista vacía
    
    max_valor = t[0]
    
    for elemento in t:
        if elemento > max_valor:
            max_valor = elemento
            
    return max_valor

tabla_t = [4, 1, 9, 7, 2]
print(f"El valor máximo de {tabla_t} es: {maximo(tabla_t)}")