a = [1,2,3,4]
for i in range(5):
    print(a[i])

''' Primero tenemos que explicar que hace el programa:
Este programa imprime los 4 primeros elementos y luego
falla al intentar acceder a un indice inexistente.

El error ocurre porque "range(5)" genera los numeros
[0,1,2,3,4], pero la lista solo tiene [0,1,2,3] por
lo que cuando el bucle intenta acceder a "a[4]", ese
indice no existe y Python lanza error.

La solucion esta en usar "range(len(a))"
