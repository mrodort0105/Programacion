def comparacion(o, m):
    # Compara longitud
    if len(o) != len(m):
        return False
    
    # Compara elementos
    for i in range(len(o)):
        if o[i]!= m[i]:
            return False
        
    return True   

palabra = input("Ingrese una palbra:")

# Inversores de palabras
invertida = palabra[::-1]
print(invertida)

# print(comparacion(palabra, invertida))
    
# Limpieza de datos
cadena = " juan.perez@dominio.com "
print("Correo:", cadena)

#Tarea A
print("Correo sin espacios:", cadena.strip())

#Tarea B
print("Correo en mayuscula:", cadena.upper())

#Tarea C
print("Correo separado:", cadena.split("@"))

# Etiqueta HTML:
clase = "Titulo"
contenido = "Mi encabezado"

html = f'<p class="{clase}">{contenido}</p>'
print(html)
