# Matriz P: [Columna 0: Mayorista, Columna 1: Minorista]
P = [
    [10.50, 15.00], 
    [5.00, 7.50],
    [25.00, 35.50],
    [1.20, 1.99]
]
suma_minorista = 0

# Recorrer filas y sumar el elemento en la posición 1 de cada fila
for fila in P:
    precio_minorista = fila[1]
    suma_minorista += precio_minorista
    
print(f"Suma Total de Precios de Minorista: {suma_minorista:.2f}€")