package ejercicioClase;

import java.util.Scanner;

public class Ejercicio_012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Usando Math
        System.out.print("Introduce un numero: ");
        double num = sc.nextDouble();

        // funcion Math.abs para obtener el valor absoluto
        double absoluto = Math.abs(num);

        System.out.println("Valor absoluto: " + absoluto);

        // Usando Operador Ternario
        System.out.print("Introduce un numero: ");
        double numero = sc.nextDouble();

        // Si el numero es negativo, multiplicamos por -1
        // Si no, lo dejamos igual
        double vAbsoluto = (numero < 0) ? -numero : numero;

        System.out.println("Valor absoluto: " + vAbsoluto);
        
    }
}

