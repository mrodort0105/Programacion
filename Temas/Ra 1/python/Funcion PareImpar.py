def es_par_o_impar(numero):
    if numero % 2 == 0:
        return "par"
    else:
        return "Impar"
num_introducido = int(input("Introduce un numero entero"))

resultado = es_par_o_impar(num_introducido)

print("El numero" ,num_introducido," es ",resultado)
