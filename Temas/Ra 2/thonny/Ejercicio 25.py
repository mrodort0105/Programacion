# 1. Inversor de Palabras y Palíndromo
palabra = "radar"
palabra_limpia = palabra.strip().lower()

# Invertir con Slicing Avanzado [::-1]
palabra_invertida = palabra_limpia[::-1]

if palabra_limpia == palabra_invertida:
    print(f"'{palabra}' es un PALÍNDROMO.")


# 2. Limpieza de Datos
cadena_suceptible = " juan.perez@dominio.com "

# A: Elimina los espacios en blanco (strip())
limpia = cadena_suceptible.strip()

# B: Conviértela a mayúsculas (upper())
mayusculas = limpia.upper()
print(f"Mayúsculas: {mayusculas}")

# C: Separa el nombre del dominio (split() con separador @)
partes = limpia.split('@')
print(f"Separación (split): {partes}")


# 3. Etiqueta HTML (f-strings)
clase = "titulo"
contenido = "Mi Encabezado"

etiqueta = f'<h1 class="{clase}">{contenido}</h1>'
print(f"Etiqueta HTML: {etiqueta}")