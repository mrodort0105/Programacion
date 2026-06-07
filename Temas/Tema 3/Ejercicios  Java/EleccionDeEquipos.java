package ejerciciosDeClase;

import java.util.Scanner;

public class EleccionDeEquipos {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String[] jugadores = new String[30];
	        int total = 0;
	        String nombre = "";

	        // Pedimos nombres
	        while (nombre.compareTo("-1") != 0) {
	            System.out.print("Introduce nombre: ");
	            nombre = sc.next();

	            if (nombre.compareTo("-1") != 0) {
	                jugadores[total] = nombre;
	                total++;
	            }
	        }

	        System.out.println("\nEquipo 1:");
	        for (int i = 0; i < total; i += 2) {
	            System.out.println(jugadores[i]);
	        }

	        System.out.println("\nEquipo 2:");
	        for (int i = 1; i < total; i += 2) {
	            System.out.println(jugadores[i]);
	        }
	    }
	}
