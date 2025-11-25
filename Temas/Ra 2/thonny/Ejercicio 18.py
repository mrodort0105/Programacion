tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]

# Usar .sort() directamente sobre la lista (modificación permanente)
tareas_dia.sort(key=len)

print(f"Lista tareas_dia modificada permanentemente (ordenada por longitud): {tareas_dia}")