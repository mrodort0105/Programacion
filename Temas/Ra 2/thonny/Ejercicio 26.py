producto = "Café Latte"
precio_unitario = 3.25
cantidad = 2
total = precio_unitario * cantidad

# Usando f-string para formato (.2f para 2 decimales)
recibo = f"""
--- RECIBO ---
Producto: {producto}
Cantidad: {cantidad}
Precio Unitario: {precio_unitario:.2f}€
----------------
TOTAL: {total:.2f}€ 
"""
print(recibo)