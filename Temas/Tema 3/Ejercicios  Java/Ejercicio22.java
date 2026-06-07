package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
        	System.out.print("Introduce un numero: ");
            numero = sc.nextInt();

            if (numero != 0) {

                // Comprobar si es par
                if (numero % 2 == 0) {
                    System.out.println("El numero es par.");
                } else {
                    System.out.println("El numero es impar.");
                }

                // Comprobar si es positivo o negativo
                if (numero > 0) {
                    System.out.println("El numero es positivo.");
                } else {
                    System.out.println("El numero es negativo.");
                }

                // Mostrar el cuadrado
                System.out.println("Su cuadrado es: " + (numero * numero));
            }

        } while (numero != 0);

        System.out.println("Saliste del programa");
    }
}

