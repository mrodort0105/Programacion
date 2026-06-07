
# Se solicita a una persona 2 numeros.
n1 = input("Introduce un numero:")
n2 = input("Introduce otro numero para saber si son iguales:")

# Se hace una conversion de string a int
n1 = int(n1)
n2 = int(n2)

# Se comparan ambos numeros
if  n1 > n2:
    print(n1, "es mayor que" ,n2)
elif n2 > n1:
    print(n2, "es mayor que" ,n1)
else:
    print(n1, "es igual" ,n2)

