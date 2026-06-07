package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero del mes: ");
        int mes = scanner.nextInt();

        int dias;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                dias = 28; // no lo consideramos año bisiesto
                break;
            default:
                dias = -1; // Mes invalido
        }

        if (dias != -1) {
            System.out.println("El mes " + mes + " tiene " + dias + " dias");
        } else {
            System.out.println("Numero de mes invalido.");
        }
    }
}

