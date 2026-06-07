#Pedir un año al usuario
anio = int(input("Ingresa un año:"))

#Verificar si es bisiesto
if  (anio % 4 == 0 and anio % 100 !=0) or (anio % 400 == 0):
    print("El año", anio, "es bisiesto")
else:
    print("El año", anio, "no es bisiesto")
