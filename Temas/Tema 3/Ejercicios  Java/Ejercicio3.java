package ejerciciosDeClase;

import java.util.Scanner;

public class Ejercicio003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el año actual: ");
		int anyoActual = sc.nextInt();
		
		System.out.println("Introduzca su año de nacimiento: ");
		int anyoNac = sc.nextInt();
		
		int edad = anyoActual - anyoNac;
		
		System.out.println("Su edad es: " + edad);
		
		
	}

}
