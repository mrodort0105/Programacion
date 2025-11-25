frutas = ["Plátano", "Manzana", "Cereza", "Naranja", "Manzana", "Kiwi"]
print(f"Lista Inicial: {frutas}")

# 1. Eliminar "Manzana" (elimina solo la primera ocurrencia)
frutas.remove("Manzana")
print(f"Tras eliminar 'Manzana': {frutas}")

# 2. Intentar eliminar "Pera" (provoca un ValueError si no se maneja)
try:
    frutas.remove("Pera")
except ValueError:
    print("Error al intentar eliminar 'Pera': Elemento no encontrado (ValueError).")
print(f"Lista final: {frutas}")