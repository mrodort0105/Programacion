package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precios por kilo
        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        // Solicitar kilos vendidos por semestre
        System.out.print("Kilos de manzanas vendidos en el primer semestre: ");
        double manzanasSem1 = sc.nextDouble();

        System.out.print("Kilos de manzanas vendidos en el segundo semestre: ");
        double manzanasSem2 = sc.nextDouble();

        System.out.print("Kilos de peras vendidos en el primer semestre: ");
        double perasSem1 = sc.nextDouble();

        System.out.print("Kilos de peras vendidos en el segundo semestre: ");
        double perasSem2 = sc.nextDouble();

        // Cálculo de ventas anuales
        double totalManzanas = (manzanasSem1 + manzanasSem2) * PRECIO_MANZANA;
        double totalPeras = (perasSem1 + perasSem2) * PRECIO_PERA;

        double totalAnual = totalManzanas + totalPeras;

        // Mostrar resultados
        System.out.println("Ingresos por manzanas: " + totalManzanas + " €");
        System.out.println("Ingresos por peras: " + totalPeras + " €");
        System.out.println("Beneficio total anual: " + totalAnual + " €");

    }
}
