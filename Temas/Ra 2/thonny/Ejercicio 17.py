tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]

# Usar sorted() para crear un nuevo informe ordenado
informe_ordenado = sorted(tareas_dia, key=str.lower)

print(f"Informe Ordenado: {informe_ordenado}")
# Demostración de que la lista original no ha cambiado
print(f"Lista Original sin cambios: {tareas_dia}")