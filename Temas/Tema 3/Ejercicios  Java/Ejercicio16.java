package ejercicioClase;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar dos numeros aleatorios entre 0 y 100
        int a = random.nextInt(101); // 0 a 100
        int b = random.nextInt(101); // 0 a 100

        // Asegurarse de que a sea menor que b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Pedir numero al usuario
        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        // Comprobar si esta en el rango
        if (numero >= a && numero <= b) {
            System.out.println("El numero esta dentro del rango.");
            System.out.println("Valores de a y b: a = " + a + ", b = " + b);
        } else {
            System.out.println("El numero esta fuera del rango.");
        }

        // Mostrar siempre el numero introducido
        System.out.println("Numero introducido: " + numero);
    }
}


