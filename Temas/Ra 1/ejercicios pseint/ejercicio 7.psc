Algoritmo Calcular_Media_y_Aprobacion
    Definir calificacion1, calificacion2, calificacion3, media Como Real;
    Definir umbral_aprobacion Como Real;
	
    umbral_aprobacion <- 5.0;
	
    Escribir "Introduce la primera calificación (C1):";
    Leer calificacion1;
	
    Escribir "Introduce la segunda calificación (C2):";
    Leer calificacion2;
	
    Escribir "Introduce la tercera calificación (C3):";
    Leer calificacion3;
	
    media <- (calificacion1 + calificacion2 + calificacion3) / 3;
	
    Escribir "----------------------------------------------";
    Escribir "La media de las tres calificaciones es:", media;
    Escribir "----------------------------------------------";
	
    Si media >= umbral_aprobacion Entonces
        Escribir "¡APROBADO! La media (", media, ") es mayor o igual a", umbral_aprobacion, ". ¡Felicidades!";
    Sino
        Escribir "REPROBADO. La media (", media, ") es menor que", umbral_aprobacion, ". Se requiere más esfuerzo";
    FinSi
	
FinAlgoritmo
	
