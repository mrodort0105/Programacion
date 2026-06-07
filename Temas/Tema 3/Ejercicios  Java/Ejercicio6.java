package ejerciciosDeClase;

import java.util.Scanner;

public class Ejercicio006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double PI = Math.PI;
		
		System.out.println("Introduce el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		
		double longitud = 2 * PI * radio; 
		
		double area = PI * Math.pow(radio, 2); //.pow: Eleva el valor de radio a la potencia de 2.
		
		System.out.println("la longitrud de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		
		
	}

}
