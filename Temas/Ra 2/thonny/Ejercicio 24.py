def es_primo(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

matriz_numeros = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]
conteo_primos = 0

for fila in matriz_numeros:
    for num in fila:
        if es_primo(num):
            conteo_primos += 1
            
print(f"Total de números primos encontrados: {conteo_primos}") # (2, 3, 5, 7, 11) -> 5 primos