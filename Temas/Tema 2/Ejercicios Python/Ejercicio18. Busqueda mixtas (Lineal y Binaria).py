import ejercicio015
import ejercicio016

numeros = [30, 66, 89, 612, 37, 55, 82, 91, 10]
eleccion = 91

print("Busqueda lineal:")
resultado = ejercicio015.buscar_numero(eleccion, numeros)

if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")

print("------------------------------------------")

print("Busqueda Binaria:")
resultado = ejercicio016.busquedaBinaria(numeros, eleccion)

if resultado != -1:
    print("El numero",eleccion,"se encuentra en la posicion",(resultado))
else:
    print("Ese numero no se encuentra.")
