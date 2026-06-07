# Creamos un array con los suedos 
sueldos = [1800, 1200, 2000, 1200, 900]

# Mostramos los sueldos originales
print("Sueldos originales:")
for i in sueldos:
    print(i)

# Actualizamos los sueldos y los mostramos actualizados
for i in range(len(sueldos)):
    sueldos[i] = sueldos[i] * 1.10

print("Sueldos actualizados con 10%")
for i in sueldos:
            print(round(i, 2))
            
