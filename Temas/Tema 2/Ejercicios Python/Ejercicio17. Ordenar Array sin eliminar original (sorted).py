tareas_dia = ["Revisar Email", "Llamar al cliente", "comprar café", "Actualizar reporte", "Planificar reunión"]

# Ordena la lista alfabeticamente
print("Lista ordenada alfabeticamente:")
informe_ordenado = sorted(tareas_dia, key=str.lower)  #sorted + key=str.lower ignora mayusculas/minusculas                                                     #sorted Ordena el array sin eliminar el original
print(informe_ordenado)

# Ordena la lista por su longitud
print("\nLista ordenada por longitud:")
informe_ordenado = sorted(tareas_dia, key=len)  #sorted + key=len ordena de mas corta a mas larga
print("La nueva lista es:", informe_ordenado)

print("\nLista original es:", tareas_dia)

