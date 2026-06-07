package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usando IF-ELSE
        System.out.print("Ingrese una nota entera (0 a 10): ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota invalida");
        }
        
        // Usando Switch
        System.out.print("Ingrese una nota entera (0 a 10): ");
        int note = scanner.nextInt();

        String resultado = switch (note) {
        	case 0, 1, 2, 3, 4 -> "Insuficiente";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7, 8 -> "Notable";
            case 9, 10 -> "Sobresaliente";
            default -> "Nota invalida";
            };
            System.out.println(resultado);
            }
        }