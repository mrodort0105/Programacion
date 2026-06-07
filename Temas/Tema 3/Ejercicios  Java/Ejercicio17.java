package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los dos numeros
        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        // Comprobar si son iguales
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales.");
        } else {
            System.out.println("Los numeros NO son iguales.");

            // Decir cual es mayor
            if (numero1 > numero2) {
                System.out.println("El mayor es: " + numero1);
            } else {
                System.out.println("El mayor es: " + numero2);
            }
        }
    }
}

