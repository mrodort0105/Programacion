package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        boolean esMayor = edad >= 18;

        System.out.println("¿Es mayor de edad? " + esMayor);

        scanner.close();
    }
}
