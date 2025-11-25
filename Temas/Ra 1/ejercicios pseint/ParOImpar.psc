Algoritmo ParOImpar
	// 1. Definir la variable. Usamos Entero.
	Definir numero Como Entero;
	
	// 2. Solicitar y leer el número.
	Escribir "Introduce un número entero:";
	Leer numero;
	
	// 3. Evaluar el módulo (resto) de la división por 2.
	Si (numero MOD 2) = 0 Entonces
		// Si el resto es 0, es par.
		Escribir "El número ", numero, " es PAR.";
	SiNo
		// Si el resto NO es 0 (será 1 en números enteros), es impar.
		Escribir "El número ", numero, " es IMPAR.";
	FinSi
FinAlgoritmo
