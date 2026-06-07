Algoritmo CalcularMediaYEstado
	
    Definir cal1, cal2, cal3, media Como Real
	
    Escribir "Ingrese la primera calificación:"
    Leer cal1
	
    Escribir "Ingrese la segunda calificación:"
    Leer cal2
	
    Escribir "Ingrese la tercera calificación:"
    Leer cal3
	
    media = (cal1 + cal2 + cal3) / 3
	
    Escribir "La media es: ", media
	
    Si media >= 5 Entonces
        Escribir "El alumno está aprobado."
    Sino
        Escribir "El alumno no está aprobado."
    FinSi
	
FinAlgoritmo
