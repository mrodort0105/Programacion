package ejerciciosDeClase;

import java.util.Scanner;

public class Ejercicio005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la primera nota: ");
        int nota1 = sc.nextInt();
        
        System.out.print("Introduce la segunda nota: ");
        int nota2 = sc.nextInt();
        
        double media = (nota1 + nota2) / 2.0;         
        System.out.println("La media de las dos notas es: " + media);
        
	}

}
