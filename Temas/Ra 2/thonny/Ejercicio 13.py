numeros = [1, 2, 3, 4, 5, 6]
primos_extraidos = []
print(f"Lista Original: {numeros}")

# Extraer el elemento en la posición 2 (el número 3)
elemento_extraido = numeros.pop(2) 
primos_extraidos.append(elemento_extraido)

# Extraer el último elemento (el número 6, usando pop() sin índice)
ultimo_extraido = numeros.pop() 
primos_extraidos.append(ultimo_extraido)

print(f"Lista Original después de extracción: {numeros}")
print(f"Elementos extraídos: {primos_extraidos}")