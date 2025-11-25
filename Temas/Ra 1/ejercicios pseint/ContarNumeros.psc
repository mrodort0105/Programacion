Algoritmo ContarHastaN
    // Declaración de variables
    Definir num Como Entero;
    Definir i Como Entero;
    
    // Pedir el número al usuario
    Escribir "Introduce un número entero positivo:";
    Leer num;
    
    // Validar que el número sea positivo
    Si num > 0 Entonces
        Escribir "Contando hasta ", num, ":";
        
        // Bucle para contar desde 1 hasta 'num'
        Para i <- 1 Hasta num Con Paso 1 Hacer
            // Mostrar el número. El "Sin Saltar" evita el salto de línea.
            Si i < num Entonces
                Escribir i, ", " Sin Saltar;
            Sino
                // Último número, sin coma al final
                Escribir i Sin Saltar;
            FinSi
        FinPara
        
        // Agregar un salto de línea al final para limpiar la salida
        Escribir ""; 
    Sino
        Escribir "El número debe ser un entero positivo.";
    FinSi
FinAlgoritmo