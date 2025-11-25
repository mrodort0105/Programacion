Algoritmo LoginConControl
	// 1. Definir variables.
	Definir usuario_valido Como Caracter;
	Definir nombre_ingresado Como Caracter;
	
	// 2. Establecer el usuario correcto.
	usuario_valido = "admin"; 
	
	// 3. Solicitar y leer el nombre de usuario.
	Escribir "Introduce tu nombre de usuario:";
	Leer nombre_ingresado;
	
	// 4. Comprobar la condición.
	Si nombre_ingresado = usuario_valido Entonces
		Escribir "¡Bienvenido ", nombre_ingresado, "!";
	SiNo
		// Esto se ejecuta SÓLO si el usuario NO es "admin"
		Escribir "Usuario incorrecto";
	FinSi
FinAlgoritmo
