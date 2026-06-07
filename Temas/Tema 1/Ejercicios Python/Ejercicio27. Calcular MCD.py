
# Pedir dos números mayores que 0
a = int(input("Introduce el primer número (mayor que 0): "))
b = int(input("Introduce el segundo número (mayor que 0): "))

# Algoritmo de Euclides (por restas)
while b != 0:
    if a > b:
        a = a - b
    else:
        b = b - a

# Mostrar el resultado
print("El MCD es:", a)
