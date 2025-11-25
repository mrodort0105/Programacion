# 1. Establecer el usuario correcto (literalmente por el programador).
USUARIO_CORRECTO = "admin" # Se usan mayúsculas para indicar que es una constante

# 2. Solicitar al usuario que ingrese su nombre.
nombre_ingresado = input("Introduce tu nombre de usuario: ")

# 3. Comprobar si el nombre ingresado coincide con el usuario válido.
if nombre_ingresado == USUARIO_CORRECTO:
    # Si es correcto, mostrar el mensaje de bienvenida.
    print(f"¡Bienvenido {nombre_ingresado}!")
else:
    # Si no es correcto, mostrar un mensaje de error.
    print("Error: Usuario incorrecto.")
