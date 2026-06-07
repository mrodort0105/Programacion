package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir numero decimal al usuario
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();

        // Comprobar si es casi-cero
        if (numero != 0 && Math.abs(numero) < 1) {
            System.out.println("El numero " + numero + " es casi-cero.");
        } else {
            System.out.println("El numero " + numero + " NO es casi-cero.");
        }
    }
}

