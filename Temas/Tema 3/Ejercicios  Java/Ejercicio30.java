package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del triangulo: ");
        int n = sc.nextInt();

        // Bucle para cada fila
        for (int i = n; i >= 1; i--) {
            // Bucle para los asteriscos en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // linea en blanco despues de cada linea
        }
    }
}

