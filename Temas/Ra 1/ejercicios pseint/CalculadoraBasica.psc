Algoritmo CalculadoraBasica
	// 1. Definir variables. Usamos Reales para permitir la división con decimales.
	Definir num1, num2, resultado Como Real;
	Definir operacion Como Caracter;
	
	// 2. Pedir y leer los dos números.
	Escribir "--- CALCULADORA BÁSICA ---";
	Escribir "Introduce el primer número:";
	Leer num1;
	Escribir "Introduce el segundo número:";
	Leer num2;
	
	// 3. Pedir y leer la operación.
	Escribir "Introduce la operación (+, -, *, /):";
	Leer operacion;
	
	// 4. Evaluar la operación seleccionada.
	Segun operacion Hacer
		"+":
			resultado = num1 + num2;
			Escribir "Resultado de la SUMA: ", resultado;
		"-":
			resultado = num1 - num2;
			Escribir "Resultado de la RESTA: ", resultado;
		"*":
			resultado = num1 * num2;
			Escribir "Resultado de la MULTIPLICACIÓN: ", resultado;
		"/":
			// Manejar el caso especial de división por cero
			Si num2 <> 0 Entonces
				resultado = num1 / num2;
				Escribir "Resultado de la DIVISIÓN: ", resultado;
			SiNo
				Escribir "¡ERROR! No se puede dividir por cero.";
			FinSi
		De Otro Modo:
			Escribir "¡ERROR! Operación no válida.";
	FinSegun
FinAlgoritmo