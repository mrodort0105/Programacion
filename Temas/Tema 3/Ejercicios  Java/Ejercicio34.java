package ejerciciosDeClase;

import java.util.Scanner;

public class Ejercicio_034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int etiqueta = 0;
		double altura = 0;
		double alturaMax = -1;
		int etiquetaMax = -1;
		
		System.out.println("Ingrese la altura de cada arbol en cm (usa -1 para salir) :");
		
		while (altura != -1) {
			System.out.println("Arbol " + etiqueta + ":");
			altura = sc.nextDouble();
			
			if (altura != -1) {
				if (altura > alturaMax) {
					alturaMax = altura;
					etiquetaMax = etiqueta;
				}
				etiqueta++;
			}
		}
		
		if (alturaMax == -1) {
			System.out.println("No se ingresaron alturas validas");
		} else {
			System.out.println("El arbol mas alto es el arbol con etiqueta " + etiquetaMax 
					+ " y tiene una altura de " + alturaMax + " cm");
		}
	}
}
