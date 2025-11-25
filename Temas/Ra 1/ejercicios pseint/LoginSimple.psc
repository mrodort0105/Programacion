Algoritmo LoginSimple
	// 1. Definir las variables.
	Definir usuario_valido Como Caracter;
	Definir nombre_ingresado Como Caracter;
	
	// 2. Establecer el usuario correcto (literalmente por el programador).
	usuario_valido = "admin"; 
	
	// 3. Solicitar al usuario que ingrese su nombre.
	Escribir "Introduce tu nombre de usuario:";
	Leer nombre_ingresado;
	
	// 4. Comprobar si el nombre ingresado coincide con el usuario válido.
	Si nombre_ingresado = usuario_valido Entonces
		Escribir "¡Bienvenido ", nombre_ingresado, "!";
	SiNo
		Escribir "Error: Usuario incorrecto.";
	FinSi
FinAlgoritmo
