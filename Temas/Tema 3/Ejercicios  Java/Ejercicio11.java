package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        double mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El numero mayor es: " + mayor);

    }
}

