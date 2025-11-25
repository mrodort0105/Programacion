inventario = ["Manzanas", "Plátanos", "Naranjas", "Peras"]

# 1. Llegada de Nueva Mercancía
inventario.append("Uvas")
inventario.append("Kiwi")
caja_grande = ["Melones", "Sandías"]
inventario.extend(caja_grande)

# 2. Reordenamiento
inventario.insert(1, "Plátanos Frescos")

# 3. Venta y Descarte
producto_vendido = inventario.pop() # Vende el último: Sandías
inventario.remove("Peras")

# 4. Reporte de Emergencia (División/Slice)
reporte_urgente = inventario[:4]

# 5. Recorrido Final
print(f"Inventario Final: {inventario}")
print(f"Producto Vendido: {producto_vendido}")
print("\nContenido del Reporte Urgente:")
for i in range(len(reporte_urgente)):
    print(f"Índice {i}: {reporte_urgente[i]}")