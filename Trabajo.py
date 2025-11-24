import re
matriz = [1, "manzanas", 5], [2, "Platanos", 7], [3, "Sandia", 2], [4, "Kiwi",4], [5, "Tomate", 8]
COLOR_ROJO = "\033[91m"
COLOR_VERDE = "\033[92m"
def buscar_id_producto(matriz_productos, COLOR_ROJO= "\033[91m"):
    inventario = ""
    producto_encontrado_datos = None
    id_producto= int(input("Que ID del producto buscas.."))
    for p in matriz_productos:
        inventario += f"[p{0}, p{1}, p{2}];"
    patron = r'\d{1}'
    resultado = re.search(patron, inventario)
    if resultado:
        for p in matriz_productos:
            if p[0] == id_producto:
                producto_encontrado_datos = p
                break
    if producto_encontrado_datos is not None:
        nombre = producto_encontrado_datos[1]
        stock = producto_encontrado_datos[2]
        print("\n--- Producto Encontrado ---")
        print(f"ID:    **{id_producto}**")
        print(f"Nombre: **{nombre}**")
        print(f"Stock:  **{stock}** unidades")
        print("--------------------------\n")
        
    else:
        print(f"\n{COLOR_ROJO} ERROR: Producto con ID {id_producto} no encontrado.\033[0m\n")

def comparar_stock(matriz_productos):
    if not matriz_productos:
        print("Este producto esta vacio")
        return
    
    max_stock_productos = [0]
    min_stock_productos = [0]
    
    for producto in matriz_productos:
        stock_actual = producto[2]
        
        if stock_actual > max_stock_productos[2]:
            max_stock_productos = producto
        
        if stock_actual < min_stock_productos[2]:
            min_stock_productos = producto
            
    print("-" * 50)
    print(f"{COLOR_VERDE}RESUMEN DE INVENTARIO{COLOR_VERDE}\033[0m")
    print("-" * 50)
    nombre_max = max_stock_productos[1]
    stock_max = max_stock_productos[2]

    print(f"{COLOR_VERDE}Stock Más Alto:{COLOR_VERDE}\033[0m")
    print(f" Producto:{nombre_max}")
    print(f" Stock: {stock_max} unidades")


    nombre_min = min_stock_productos[1]
    stock_min = min_stock_productos[2]
    print("-" * 50)
    print(f"\n{COLOR_ROJO} Stock mas bajo:{COLOR_ROJO}\033[0m\n")
    print(f"  Producto: **{nombre_min}**")
    print(f"  Stock:    **{stock_min}** unidades")
    print("-" * 50)

comparar_stock(matriz)
#buscar_id_producto(matriz)