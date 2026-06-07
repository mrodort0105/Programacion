package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos las notas
        System.out.print("Introduce la nota del primer trimestre: ");
        int n1 = sc.nextInt();

        System.out.print("Introduce la nota del segundo trimestre: ");
        int n2 = sc.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        int n3 = sc.nextInt();

        // Calculo de la media real
        double mediaReal = (n1 + n2 + n3) / 3.0;

        // Calculo de la media entera
        int mediaEntera = (int) mediaReal;

        // Mostrar resultados
        System.out.println("Nota media boletin: " + mediaEntera);
        System.out.println("Nota media expediente academico: " + mediaReal);

    }
}

