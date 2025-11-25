Algoritmo MayorOMenorOIgual
	// 1. Definir las variables como Reales para permitir decimales, aunque Entero también funcionaría.
	Definir num1, num2 Como Real;
	
	// 2. Solicitar y leer los dos números.
	Escribir "Introduce el primer número:";
	Leer num1;
	Escribir "Introduce el segundo número:";
	Leer num2;
	
	// 3. Evaluar las condiciones.
	Si num1 > num2 Entonces
		Escribir "El número mayor es: ", num1;
		SinoSi num2 > num1 Entonces
		Escribir "El número mayor es: ", num2;
	SiNo
		// Si no se cumple ni num1 > num2, ni num2 > num1, 
		// la única opción restante es que sean iguales.
		Escribir "Los números son iguales: ", num1;
	FinSi
FinAlgoritmo