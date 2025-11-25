numero_original = float(input("Introduce un numero decimal negativo(Ej:-15.68"))
# 1. Aplicar abs() para pasar a positivo.
# 2. Aplicar round() para redondear a entero.
numero_final = round(abs(numero_original))

print(f"El número original es: {numero_original}")
print(f"El número redondeado a entero positivo es: {numero_final}")
