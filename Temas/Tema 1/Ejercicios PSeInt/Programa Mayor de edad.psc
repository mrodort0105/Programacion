Algoritmo MayorEdad
	
    Definir anioNacimiento, anioActual, edad Como Entero
    
    anioActual = 2025 
	
    Escribir "Ingrese su año de nacimiento: "
    Leer anioNacimiento
    
    edad = anioActual - anioNacimiento
    
    Si edad >= 18 Entonces
        Escribir "Usted es mayor de edad."
    Sino
        Escribir "Usted es menor de edad."
    FinSi
	
	Escribir "Su edad es: " edad
	
FinAlgoritmo
