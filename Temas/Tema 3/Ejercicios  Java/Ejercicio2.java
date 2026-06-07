package ejerciciosDeClase;
import java.util.Scanner;
public class Ejercicio002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int edad = sc.nextInt();
		
		edad++;
				
		System.out.println("Su edad el año que viene es: " + edad);
	}

}
