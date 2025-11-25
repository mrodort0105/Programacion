Algoritmo media
		Definir anio_nacimiento, anio_actual, edad Como Entero;
		año_actual <- 2025; 
		Escribir "Introduce tu año de nacimiento:";
		Leer anio_nacimiento;
		edad <- año_actual - año_nacimiento;
		Si edad >= 18 Entonces
			Escribir "Con ", edad, " años, eres mayor de edad.";
		SiNo
			Escribir "Con ", edad, " años, eres menor de edad.";
		FinSi
FinAlgoritmo
