package ejercicioClase;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // dos numeros aleatorios entre 0 y 100
        int a = random.nextInt(101); 
        int b = random.nextInt(101);

        // Asegurar que a < b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int numero;

        // repetir hasta que el usuario acierte un numero dentro del rango
        do {
            System.out.print("Ingrese un numero entero: ");
            numero = scanner.nextInt();

            // Mostrar el numero introducido
            System.out.println("Numero introducido: " + numero);

            if (numero < a || numero > b) {
                System.out.println("El numero esta fuera del rango. Intente de nuevo.");
            }

        } while (numero < a || numero > b);

        // Cuando acierta
        System.out.println("El numero esta dentro del rango");
        System.out.println("Valores de a y b: a = " + a + ", b = " + b);

    }
}

