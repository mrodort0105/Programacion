num = -1
while num <= 0:
    try:
        num=int(input("Introduce un numero positivo"))
        if num <=0:
            print ("Error, el numero debe ser positivo")
    except ValueError:
            print ("Error,Debes introducir un numero entero")
            num0 -1
# 2. Contar con 'while' y almacenar en una lista
i = 1
cuenta = []
while i <= num:
    cuenta.append(str(i))
    i += 1
# 3. Imprimir el resultado en una sola línea, separado por comas
print(", ".join(cuenta))
