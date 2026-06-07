package ejercicioClase;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int aciertos = 0;
        int respuesta;
        int a, b;

        System.out.println("Escribe la respuesta");

        do {
            // Generar dos numeros entre 1 y 100
            a = random.nextInt(100) + 1;
            b = random.nextInt(100) + 1;

            System.out.print("¿Cuanto es " + a + " + " + b + "? ");
            respuesta = sc.nextInt();

            if (respuesta == a + b) {
                System.out.println("Correcto\n");
                aciertos++;
            } else {
                System.out.println("Incorrecto. El resultado era " + (a + b) + ".");
            }

        } while (respuesta == a + b); // se repite mientras la respuesta sea correcta

        System.out.println("Realizaste " + aciertos + " operaciones correctas.");
    }
}

