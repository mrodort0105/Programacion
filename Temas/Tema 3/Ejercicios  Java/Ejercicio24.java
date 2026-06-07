package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int edadMin = 0;
        int edadMax = 0;
        boolean primeraEdad = true; // para saber si hemos leído la primera edad válida

        System.out.println("Introduce las edades de los alumnos (-1 para terminar):");

        while (true) {
            System.out.print("Edad: ");
            edad = sc.nextInt();

            if (edad == -1) {
                break; // termina el programa
            }

            // si la primera edad es valida inicializamos variables
            if (primeraEdad) {
                edadMin = edad;
                edadMax = edad;
                primeraEdad = false;
            } else {
                // Actualizar la minima y la maxima
                if (edad < edadMin) {
                    edadMin = edad;
                }
                if (edad > edadMax) {
                    edadMax = edad;
                }
            }
        }

        if (primeraEdad) {
            System.out.println("Edades invalidas.");
        } else {
            System.out.println("Edad minima: " + edadMin);
            System.out.println("Edad maxima: " + edadMax);
        }

    }
}
