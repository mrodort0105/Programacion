def contar_y_reemplazar_vocales(cadena):
    vocales = "aeiouAEIOU"
    contador = sum(cadena.count(v) for v in vocales)  # Contamos todas las vocales
    nueva_cadena = cadena
    for v in vocales:
        nueva_cadena = nueva_cadena.replace(v, 'X')  # Reemplazamos cada vocal por 'X'
    return contador, nueva_cadena

# Programa principal
def main():
    texto = input("Introduce una cadena de texto: ")
    num_vocales, texto_modificado = contar_y_reemplazar_vocales(texto)
    print(f"Número de vocales: {num_vocales}")
    print(f"Cadena modificada: {texto_modificado}")

main()
