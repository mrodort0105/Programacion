
def main():
    # Solicitar nombre de usuario
    usuario = input("Introduce tu nombre de usuario: ")

    # Solicitar contraseña
    contraseña = input("Introduce tu contraseña (minimo 8 caracteres): ")

    # Validar la longitud de la contraseña
    if len(contraseña) >= 8:
        print(f"¡Login exitoso! Usuario: {usuario}")
    else:
        print("Error: La contraseña debe tener al menos 8 caracteres.")

# Ejecutar el programa principal
main()
