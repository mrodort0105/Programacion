Algoritmo Bisiesto
	// 1. Definir la variable.
	Definir anio Como Entero;
	
	// 2. Solicitar y leer el año.
	Escribir "Introduce un año (ej: 2024):";
	Leer anio;
	
	// 3. Evaluar la condición compuesta.
	// La condición se traduce como: 
	// (Divisible por 4) Y ( (No divisible por 100) O (Divisible por 400) )
	
	Si ( (anio MOD 4) = 0 ) Y ( ( (anio MOD 100) <> 0 ) O ( (anio MOD 400) = 0 ) ) Entonces
		Escribir El anio, anio, " ES bisiesto.";
	SiNo
		Escribir El anio, anio, " NO es bisiesto.";
	FinSi
FinAlgoritmo
