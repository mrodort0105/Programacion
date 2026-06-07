#Vamos a crear una tienda a la cual le vamos a gestionar su inventario
print("Bienvenido a la tienda de Juan\n")

inventario = ["Manzanas", "Platanos", "Naranjas", "Peras"]
print("Inventario de Frutas actuales:", inventario)

print("\nHan llegado dos camiones con mercancia nueva.")

#Añadimos las futas nuevas al inventario
inventario.append("Uvas")
inventario.append("Kiwis")

#Unimosla mercancia del camion al inventario
camion = ["Melones"]
inventario.extend(camion)

print("Inventario de frutas actualizado:", inventario)

#Venta de frutas
productoVendido = inventario.pop(6) #Se vendio el indice 6 (Melones)
print("\nproductos vendidos:", productoVendido)

print("Inventario de frutas actualizado:", inventario)

#Peras caducadas
print("\nYa no hay peras disponibles porque se han cadudado...")

inventario.remove("Peras")
print("Inventario de frutas actualizado:", inventario)

#Necesitamos un reporte urgente de las 4 primeras frutas disponibles
reporteUrgente = inventario[:4:]
print("\nReporte de frutas:", reporteUrgente)

print("\nInventario de frutas actuales:")
#Necesitamos el inventario ordenado (Indice: fruta)
for i in range(len(inventario)):
    print("Indice", i, ":", inventario[i])

    


