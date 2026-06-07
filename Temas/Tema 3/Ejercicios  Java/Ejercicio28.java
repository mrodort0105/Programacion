package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para calcular su factorial: ");
        int numero = sc.nextInt();

        long factorial = 1; // long para numeros grandes

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

