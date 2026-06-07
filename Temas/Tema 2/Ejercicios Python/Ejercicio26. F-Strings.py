# Variables del Producto
producto = "Espresso Doble"
precio_unitario = 3.50

# Variables de la Transacción
cantidad = 3
tasa_iva = 0.16 # 16% de IVA

# Variables del Cliente
cliente_nombre = "Ana Maria Lopez"
id_transaccion = "CAF-2025-472"

factura = f"------Cafeteria de Jose------\nTransaccion - '{id_transaccion}'\nCliente '{cliente_nombre}'\n-----------------------------\nProducto  '{cantidad} {producto}'\n-----------------------------\nCoste - '{precio_unitario}\nIVA - '{tasa_iva}\n-----------------------------\n'Coste total '{precio_unitario} + ({precio_unitario} * {tasa_iva})'"

print(factura)