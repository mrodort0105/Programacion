package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos un numero decimal al usuario
        System.out.print("Introduce un numero decimal: ");
        double numero = sc.nextDouble();

        // Redondeamos al entero mas proximo
        long redondeado = Math.round(numero);

        // Mostramos el resultado
        System.out.println("Numero redondeado: " + redondeado);

    }
}

