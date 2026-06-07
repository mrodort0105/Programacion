a = [10, 20, 30]
b = [10, 20, 30]
c = [30, 20, 10] 
d = [10, 20]

print("Comprobar directamente")
print(f"A == B: {a == b}") # True
print(f"A == C: {a == c}") # False (el orden importa)
print(f"A == D: {a == d}") # False (la longitud importa)

# Funcion para saber si tienen diferente longitud y valores
def comparacion(lista1, lista2):
    # Compara longitud
    if len(lista1) != len(lista2):
        return False
    
    # Compara elementos
    for i in range(len(lista1)):
        if lista1[i]!= lista2[i]:
            return False
        
    return True     # Si ambas son correstas


# Funcion para comparar sin importar el orden
def compararSinOrden(lista1, lista2):
    
    return sorted(lista1) == sorted(lista2)


#Comparacion usando funcion  comparacion
print("\nComparar si los arrays son iguales")
print("Comparar A y B:", comparacion(a, b))  
print("Comparar A y C:", comparacion(a, c))  
print("Comparar A y D:", comparacion(a, d))  

#Comprobacion usando funcion compararSinOrden
print("\nComprobar sin importar el orden")
print("Comparar A y C:", compararSinOrden(a, c)) 


