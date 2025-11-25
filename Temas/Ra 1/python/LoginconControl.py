# 1. Establecer el usuario correcto (constante).
USUARIO_CORRECTO = "admin" 

# 2. Solicitar y leer el nombre de usuario.
nombre_ingresado = input("Introduce tu nombre de usuario: ")

# 3. Comprobar la condición.
if nombre_ingresado == USUARIO_CORRECTO:
    # Bloque IF: se ejecuta si son IGUALES
    print("¡Bienvenido {nombre_ingresado}!")
else:
    # Bloque ELSE: se ejecuta si son DIFERENTES
    print("Usuario incorrecto")
